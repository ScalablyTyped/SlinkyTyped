package typingsSlinky.linkifyjs.elementMod

import typingsSlinky.linkifyjs.PartialGlobalEventHandler
import typingsSlinky.linkifyjs.mod.LinkEntityType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options
  extends typingsSlinky.linkifyjs.mod.Options {
  /**
    * Add event listeners to newly created link elements.
    * Takes a hash where each key is an standard event name and the value is an event handler.
    *
    * Also accepts a function that takes the unformatted href and the link type (e.g., 'url', 'email', etc.) and returns the hash.
    *
    * @default null
    */
  var events: js.UndefOr[
    PartialGlobalEventHandler | (js.Function2[/* href */ String, /* type */ LinkEntityType, PartialGlobalEventHandler])
  ] = js.native
  /**
    *  Prevent linkify from trying to parse links in the specified tags.
    *
    *  This is useful when running linkify on arbitrary HTML.
    *
    *  @default []
    */
  var ignoreTags: js.UndefOr[js.Array[String]] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withEventsFunction2(value: (/* href */ String, /* type */ LinkEntityType) => PartialGlobalEventHandler): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withEvents(
      value: PartialGlobalEventHandler | (js.Function2[/* href */ String, /* type */ LinkEntityType, PartialGlobalEventHandler])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("events")(js.undefined)
        ret
    }
    @scala.inline
    def withIgnoreTags(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTags")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutIgnoreTags: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ignoreTags")(js.undefined)
        ret
    }
  }
  
}

