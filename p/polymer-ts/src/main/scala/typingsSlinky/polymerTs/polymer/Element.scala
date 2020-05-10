package typingsSlinky.polymerTs.polymer

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element extends js.Object {
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  var attributeChanged: js.UndefOr[
    js.Function3[/* attrName */ String, /* oldVal */ js.Any, /* newVal */ js.Any, Unit]
  ] = js.native
  var behaviors: js.UndefOr[js.Array[js.Object]] = js.native
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  var factoryImpl: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var listeners: js.UndefOr[js.Object] = js.native
  var observers: js.UndefOr[js.Array[String]] = js.native
  var properties: js.UndefOr[js.Object] = js.native
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
}

object Element {
  @scala.inline
  def apply(): Element = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAttached(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAttached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attached")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeChanged(value: (/* attrName */ String, /* oldVal */ js.Any, /* newVal */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeChanged")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAttributeChanged: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeChanged")(js.undefined)
        ret
    }
    @scala.inline
    def withBehaviors(value: js.Array[js.Object]): Self = {
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
    def withCreated(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreated: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("created")(js.undefined)
        ret
    }
    @scala.inline
    def withDetached(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDetached: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detached")(js.undefined)
        ret
    }
    @scala.inline
    def withFactoryImpl(value: /* repeated */ js.Any => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryImpl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFactoryImpl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("factoryImpl")(js.undefined)
        ret
    }
    @scala.inline
    def withListeners(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutListeners: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listeners")(js.undefined)
        ret
    }
    @scala.inline
    def withObservers(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observers")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutObservers: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("observers")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProperties: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("properties")(js.undefined)
        ret
    }
    @scala.inline
    def withReady(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutReady: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ready")(js.undefined)
        ret
    }
  }
  
}

