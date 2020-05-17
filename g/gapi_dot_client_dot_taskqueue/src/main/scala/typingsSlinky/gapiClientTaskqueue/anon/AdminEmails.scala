package typingsSlinky.gapiClientTaskqueue.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdminEmails extends js.Object {
  /** Email addresses of users who are "admins" of the TaskQueue. This means they can control the queue, eg set ACLs for the queue. */
  var adminEmails: js.UndefOr[js.Array[String]] = js.native
  /** Email addresses of users who can "consume" tasks from the TaskQueue. This means they can Dequeue and Delete tasks from the queue. */
  var consumerEmails: js.UndefOr[js.Array[String]] = js.native
  /** Email addresses of users who can "produce" tasks into the TaskQueue. This means they can Insert tasks into the queue. */
  var producerEmails: js.UndefOr[js.Array[String]] = js.native
}

object AdminEmails {
  @scala.inline
  def apply(): AdminEmails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdminEmails]
  }
  @scala.inline
  implicit class AdminEmailsOps[Self <: AdminEmails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdminEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAdminEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("adminEmails")(js.undefined)
        ret
    }
    @scala.inline
    def withConsumerEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutConsumerEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("consumerEmails")(js.undefined)
        ret
    }
    @scala.inline
    def withProducerEmails(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producerEmails")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProducerEmails: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("producerEmails")(js.undefined)
        ret
    }
  }
  
}

