package typingsSlinky.rivets

import typingsSlinky.std.Event_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnonHandler extends js.Object {
  // Augment the event handler of the on-* binder
  var handler: js.UndefOr[js.Function3[/* context */ js.Any, /* ev */ Event_, /* biding */ js.Any, Unit]] = js.native
  // Attribute prefix in templates
  var prefix: js.UndefOr[String] = js.native
  // Preload templates with initial data on bind
  var preloadData: js.UndefOr[Boolean] = js.native
  // Root sightglass interface for keypaths
  var rootInterface: js.UndefOr[String] = js.native
  // Template delimiters for text bindings
  var templateDelimiters: js.UndefOr[js.Array[String]] = js.native
}

object AnonHandler {
  @scala.inline
  def apply(): AnonHandler = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnonHandler]
  }
  @scala.inline
  implicit class AnonHandlerOps[Self <: AnonHandler] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withHandler(value: (/* context */ js.Any, /* ev */ Event_, /* biding */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutHandler: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("handler")(js.undefined)
        ret
    }
    @scala.inline
    def withPrefix(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("prefix")(js.undefined)
        ret
    }
    @scala.inline
    def withPreloadData(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadData")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPreloadData: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("preloadData")(js.undefined)
        ret
    }
    @scala.inline
    def withRootInterface(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootInterface")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRootInterface: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rootInterface")(js.undefined)
        ret
    }
    @scala.inline
    def withTemplateDelimiters(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateDelimiters")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTemplateDelimiters: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("templateDelimiters")(js.undefined)
        ret
    }
  }
  
}

