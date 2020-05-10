package typingsSlinky.backboneMarionette.mod

import typingsSlinky.backboneMarionette.backboneMarionetteBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ViewMixinOptions extends js.Object {
  /**
    * Behavior objects to assign to this View.
    */
  var behaviors: js.UndefOr[js.Array[Behavior]] = js.native
  /**
    * Customize the event prefix for events that are forwarded through the
    * collection view.
    */
  var childViewEventPrefix: js.UndefOr[String | `false`] = js.native
  /**
    * Use the childViewEvents attribute to map child events to methods on the
    * parent view.
    */
  var childViewEvents: js.UndefOr[EventsHash] = js.native
  /**
    * A childViewTriggers hash or method permits proxying of child view events
    * without manually setting bindings. The values of the hash should be a
    * string of the event to trigger on the parent.
    */
  var childViewTriggers: js.UndefOr[EventsHash] = js.native
  /**
    * Bind to events that occur on attached collections.
    */
  var collectionEvents: js.UndefOr[EventsHash] = js.native
  /**
    * Bind to events that occur on attached models.
    */
  var modelEvents: js.UndefOr[EventsHash] = js.native
  /**
    * The view triggers attribute binds DOM events to Marionette View events
    * that can be responded to at the view or parent level.
    */
  var triggers: js.UndefOr[EventsHash] = js.native
  /**
    * Name parts of your template to be used
    * throughout the view with the ui attribute.
    */
  var ui: js.UndefOr[js.Any] = js.native
}

object ViewMixinOptions {
  @scala.inline
  def apply(): ViewMixinOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ViewMixinOptions]
  }
  @scala.inline
  implicit class ViewMixinOptionsOps[Self <: ViewMixinOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withBehaviors(value: js.Array[Behavior]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBehaviors: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("behaviors")(js.undefined)
        ret
    }
    @scala.inline
    def withChildViewEventPrefix(value: String | `false`): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childViewEventPrefix")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildViewEventPrefix: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childViewEventPrefix")(js.undefined)
        ret
    }
    @scala.inline
    def withChildViewEvents(value: EventsHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childViewEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildViewEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childViewEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withChildViewTriggers(value: EventsHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childViewTriggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChildViewTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("childViewTriggers")(js.undefined)
        ret
    }
    @scala.inline
    def withCollectionEvents(value: EventsHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutCollectionEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("collectionEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withModelEvents(value: EventsHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelEvents")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModelEvents: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("modelEvents")(js.undefined)
        ret
    }
    @scala.inline
    def withTriggers(value: EventsHash): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTriggers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("triggers")(js.undefined)
        ret
    }
    @scala.inline
    def withUi(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutUi: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ui")(js.undefined)
        ret
    }
  }
  
}

