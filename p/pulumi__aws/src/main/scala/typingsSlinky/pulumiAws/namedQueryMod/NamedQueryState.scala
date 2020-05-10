package typingsSlinky.pulumiAws.namedQueryMod

import typingsSlinky.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NamedQueryState extends js.Object {
  /**
    * The database to which the query belongs.
    */
  val database: js.UndefOr[Input[String]] = js.native
  /**
    * A brief explanation of the query. Maximum length of 1024.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * The plain language name for the query. Maximum length of 128.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The text of the query itself. In other words, all query statements. Maximum length of 262144.
    */
  val query: js.UndefOr[Input[String]] = js.native
  /**
    * The workgroup to which the query belongs. Defaults to `primary`
    */
  val workgroup: js.UndefOr[Input[String]] = js.native
}

object NamedQueryState {
  @scala.inline
  def apply(): NamedQueryState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NamedQueryState]
  }
  @scala.inline
  implicit class NamedQueryStateOps[Self <: NamedQueryState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDatabase(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDatabase: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("database")(js.undefined)
        ret
    }
    @scala.inline
    def withDescription(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDescription: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("description")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withQuery(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutQuery: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.undefined)
        ret
    }
    @scala.inline
    def withWorkgroup(value: Input[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workgroup")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutWorkgroup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("workgroup")(js.undefined)
        ret
    }
  }
  
}

