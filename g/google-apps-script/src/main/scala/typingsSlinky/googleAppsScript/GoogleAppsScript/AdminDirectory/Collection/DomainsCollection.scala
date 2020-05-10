package typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Collection

import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Domains
import typingsSlinky.googleAppsScript.GoogleAppsScript.AdminDirectory.Schema.Domains2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainsCollection extends js.Object {
  // Retrieves a domain of the customer.
  def get(customer: String, domainName: String): Domains = js.native
  // Inserts a domain of the customer.
  def insert(resource: Domains, customer: String): Domains = js.native
  // Lists the domains of the customer.
  def list(customer: String): Domains2 = js.native
  // Deletes a domain of the customer.
  def remove(customer: String, domainName: String): Unit = js.native
}

object DomainsCollection {
  @scala.inline
  def apply(
    get: (String, String) => Domains,
    insert: (Domains, String) => Domains,
    list: String => Domains2,
    remove: (String, String) => Unit
  ): DomainsCollection = {
    val __obj = js.Dynamic.literal(get = js.Any.fromFunction2(get), insert = js.Any.fromFunction2(insert), list = js.Any.fromFunction1(list), remove = js.Any.fromFunction2(remove))
    __obj.asInstanceOf[DomainsCollection]
  }
  @scala.inline
  implicit class DomainsCollectionOps[Self <: DomainsCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGet(value: (String, String) => Domains): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withInsert(value: (Domains, String) => Domains): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("insert")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withList(value: String => Domains2): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("list")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withRemove(value: (String, String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remove")(js.Any.fromFunction2(value))
        ret
    }
  }
  
}

