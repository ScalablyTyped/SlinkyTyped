package typingsSlinky.polymer.mod._Global_.polymer

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.CustomEvent
import org.scalajs.dom.raw.DocumentFragment
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLElement
import org.scalajs.dom.raw.HTMLLinkElement
import org.scalajs.dom.raw.Node
import typingsSlinky.std.ArrayConstructor
import typingsSlinky.std.BooleanConstructor
import typingsSlinky.std.DateConstructor
import typingsSlinky.std.NumberConstructor
import typingsSlinky.std.ObjectConstructor
import typingsSlinky.std.StringConstructor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommonBase extends js.Object {
  /* polymer-standard */
  // Annotations
  @JSName("$")
  var $: js.UndefOr[js.Any] = js.native
  // Utils
  @JSName("$$")
  var DollarDollar: js.UndefOr[js.Function1[/* selector */ String, Element]] = js.native
  var arrayDelete: js.UndefOr[js.Function2[/* path */ String | js.Array[_], /* item */ js.Any, js.Array[_]]] = js.native
  var async: js.UndefOr[
    js.Function2[/* callback */ js.Function0[Unit], /* waitTime */ js.UndefOr[Double], Double]
  ] = js.native
  var attached: js.UndefOr[js.Function0[Unit]] = js.native
  var attachedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  var attributeChanged: js.UndefOr[
    js.Function3[/* name */ String, /* oldValue */ js.Any, /* newValue */ js.Any, Unit]
  ] = js.native
  var attributeChangedCallback: js.UndefOr[
    js.Function4[
      /* attributeName */ String, 
      /* oldValue */ String | Null, 
      /* newValue */ String | Null, 
      /* namespace */ String | Null, 
      Unit
    ]
  ] = js.native
  var attributeFollows: js.UndefOr[
    js.Function3[/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement, Unit]
  ] = js.native
  var beforeRegister: js.UndefOr[js.Function0[Unit]] = js.native
  // Behaviors
  var behaviors: js.UndefOr[js.Array[js.Object]] = js.native
  var cancelAsync: js.UndefOr[js.Function1[/* handle */ Double, Unit]] = js.native
  var cancelDebouncer: js.UndefOr[js.Function1[/* jobName */ String, Unit]] = js.native
  var classFollows: js.UndefOr[
    js.Function3[/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement, Unit]
  ] = js.native
  var copyOwnProperty: js.UndefOr[
    js.Function3[/* name */ String, /* source */ js.Object, /* target */ js.Object, Unit]
  ] = js.native
  var create: js.UndefOr[js.Function2[/* tag */ String, /* props */ js.Object, Element]] = js.native
  var created: js.UndefOr[js.Function0[Unit]] = js.native
  var createdCallback: js.UndefOr[js.Function0[Unit]] = js.native
  // Debouncer
  var debounce: js.UndefOr[
    js.Function3[/* jobName */ String, /* callback */ js.Function, /* wait */ js.UndefOr[Double], Unit]
  ] = js.native
  var deserialize: js.UndefOr[
    (js.Function2[/* value */ String, /* type */ NumberConstructor, Double]) with (js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]) with (js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]) with (js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[_]]) with (js.Function2[/* value */ String, /* type */ DateConstructor, js.Date]) with (js.Function2[/* value */ String, /* type */ StringConstructor, String])
  ] = js.native
  var detached: js.UndefOr[js.Function0[Unit]] = js.native
  var detachedCallback: js.UndefOr[js.Function0[Unit]] = js.native
  var distributeContent: js.UndefOr[js.Function0[Unit]] = js.native
  // Shady
  var domHost: js.UndefOr[js.Function0[Element]] = js.native
  var elementMatches: js.UndefOr[js.Function2[/* selector */ String, /* node */ js.UndefOr[Element], Boolean]] = js.native
  var extend: js.UndefOr[js.Function2[/* prototype */ js.Object, /* api */ js.Object, js.Object]] = js.native
  // Extends
  var `extends`: js.UndefOr[String] = js.native
  // Constructors
  var factoryImpl: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var fire: js.UndefOr[
    js.Function3[
      /* type */ String, 
      /* detail */ js.UndefOr[js.Any], 
      /* options */ js.UndefOr[js.Object], 
      CustomEvent
    ]
  ] = js.native
  var flushDebouncer: js.UndefOr[js.Function1[/* jobName */ String, Unit]] = js.native
  var get: js.UndefOr[
    js.Function2[/* path */ String | (js.Array[String | Double]), /* root */ js.UndefOr[js.Object], _]
  ] = js.native
  var getContentChildNodes: js.UndefOr[js.Function1[/* selector */ String, js.Array[Node]]] = js.native
  var getContentChildren: js.UndefOr[js.Function1[/* selector */ String, js.Array[HTMLElement]]] = js.native
  var getEffectiveChildNodes: js.UndefOr[js.Function0[js.Array[Node]]] = js.native
  var getEffectiveChildren: js.UndefOr[js.Function0[js.Array[Node]]] = js.native
  var getNativePrototype: js.UndefOr[js.Function1[/* tag */ String, js.Object]] = js.native
  var getPropertyInfo: js.UndefOr[js.Function1[/* property */ String, js.Object]] = js.native
  /* polymer-micro */
  // Attributes
  var hostAttributes: js.UndefOr[StringDictionary[js.Any]] = js.native
  var importHref: js.UndefOr[
    js.Function3[
      /* href */ String, 
      /* onload */ js.UndefOr[js.Function], 
      /* onerror */ js.UndefOr[js.Function], 
      HTMLLinkElement
    ]
  ] = js.native
  // Template {
  var instanceTemplate: js.UndefOr[js.Function1[/* template */ HTMLElement, DocumentFragment]] = js.native
  // Tag
  var is: String = js.native
  var isDebouncerActive: js.UndefOr[js.Function1[/* jobName */ String, Boolean]] = js.native
  var isLightDescendant: js.UndefOr[js.Function1[/* node */ HTMLElement, Boolean]] = js.native
  var isLocalDescendant: js.UndefOr[js.Function1[/* node */ HTMLElement, Boolean]] = js.native
  var linkPaths: js.UndefOr[js.Function2[/* to */ String, /* from */ js.UndefOr[String], Unit]] = js.native
  var listen: js.UndefOr[
    js.Function3[/* node */ Element, /* eventName */ String, /* methodName */ String, Unit]
  ] = js.native
  // Events
  var listeners: js.UndefOr[StringDictionary[String]] = js.native
  var mixin: js.UndefOr[js.Function2[/* target */ js.Object, /* source */ js.Object, js.Object]] = js.native
  // NotifyPath
  var notifyPath: js.UndefOr[
    js.Function3[/* path */ String, /* value */ js.Any, /* fromAbove */ js.Any, Unit]
  ] = js.native
  var notifySplices: js.UndefOr[js.Function2[/* path */ String, /* splices */ js.Array[PolymerSplice], Unit]] = js.native
  var observers: js.UndefOr[js.Array[String]] = js.native
  var pop: js.UndefOr[js.Function1[/* path */ String, _]] = js.native
  // Properties
  var properties: js.UndefOr[StringDictionary[PropConstructorType | PropObjectType]] = js.native
  var push: js.UndefOr[js.Function2[/* path */ String, /* repeated */ js.Any, Double]] = js.native
  /* polymer-mini */
  // Ready
  var ready: js.UndefOr[js.Function0[Unit]] = js.native
  var reflectPropertiesToAttribute: js.UndefOr[js.Function1[/* name */ String, Unit]] = js.native
  /* common api */
  var registerCallback: js.UndefOr[js.Function0[Unit]] = js.native
  var registered: js.UndefOr[js.Function0[Unit]] = js.native
  // ResolveUrl
  var resolveUrl: js.UndefOr[js.Function1[/* url */ String, String]] = js.native
  // Styling
  var scopeSubtree: js.UndefOr[js.Function2[/* container */ Element, /* shouldObserve */ Boolean, Unit]] = js.native
  var serialize: js.UndefOr[js.Function1[/* value */ js.Any, String]] = js.native
  var serializeValueToAttribute: js.UndefOr[
    js.Function3[/* value */ js.Any, /* attribute */ String, /* node */ js.UndefOr[Element], Unit]
  ] = js.native
  var set: js.UndefOr[
    js.Function3[
      /* path */ String | (js.Array[String | Double]), 
      /* value */ js.Any, 
      /* root */ js.UndefOr[js.Object], 
      Unit
    ]
  ] = js.native
  // Gestures
  var setScrollDirection: js.UndefOr[js.Function2[/* direction */ String, /* node */ js.UndefOr[HTMLElement], Unit]] = js.native
  var shift: js.UndefOr[js.Function1[/* path */ String, _]] = js.native
  var splice: js.UndefOr[
    js.Function4[
      /* path */ String, 
      /* index */ Double, 
      /* removeCount */ Double, 
      /* repeated */ js.Any, 
      Double
    ]
  ] = js.native
  var toggleClass: js.UndefOr[
    js.Function3[
      /* name */ String, 
      /* bool */ js.UndefOr[Boolean], 
      /* node */ js.UndefOr[HTMLElement], 
      Unit
    ]
  ] = js.native
  var transform: js.UndefOr[js.Function2[/* transform */ String, /* node */ js.UndefOr[HTMLElement], Unit]] = js.native
  var translate3d: js.UndefOr[
    js.Function4[/* x */ Double, /* y */ Double, /* z */ Double, /* node */ js.UndefOr[HTMLElement], Unit]
  ] = js.native
  var unlinkPaths: js.UndefOr[js.Function1[/* path */ String, Unit]] = js.native
  var unlisten: js.UndefOr[
    js.Function3[/* node */ Element, /* eventName */ String, /* methodName */ String, Unit]
  ] = js.native
  var unshift: js.UndefOr[js.Function2[/* path */ String, /* repeated */ js.Any, Double]] = js.native
  // XStyling
  var updateStyles: js.UndefOr[js.Function1[/* styles */ js.UndefOr[StringDictionary[String]], Unit]] = js.native
}

object CommonBase {
  @scala.inline
  def apply(is: String): CommonBase = {
    val __obj = js.Dynamic.literal(is = is.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommonBase]
  }
  @scala.inline
  implicit class CommonBaseOps[Self <: CommonBase] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withIs(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("is")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def with$(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def without$: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$")(js.undefined)
        ret
    }
    @scala.inline
    def withDollarDollar(value: /* selector */ String => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$$")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutDollarDollar: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("$$")(js.undefined)
        ret
    }
    @scala.inline
    def withArrayDelete(value: (/* path */ String | js.Array[_], /* item */ js.Any) => js.Array[_]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayDelete")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutArrayDelete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("arrayDelete")(js.undefined)
        ret
    }
    @scala.inline
    def withAsync(value: (/* callback */ js.Function0[Unit], /* waitTime */ js.UndefOr[Double]) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("async")(js.undefined)
        ret
    }
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
    def withAttachedCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachedCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutAttachedCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attachedCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeChanged(value: (/* name */ String, /* oldValue */ js.Any, /* newValue */ js.Any) => Unit): Self = {
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
    def withAttributeChangedCallback(
      value: (/* attributeName */ String, /* oldValue */ String | Null, /* newValue */ String | Null, /* namespace */ String | Null) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeChangedCallback")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutAttributeChangedCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeChangedCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withAttributeFollows(value: (/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeFollows")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutAttributeFollows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("attributeFollows")(js.undefined)
        ret
    }
    @scala.inline
    def withBeforeRegister(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRegister")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutBeforeRegister: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("beforeRegister")(js.undefined)
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
    def withCancelAsync(value: /* handle */ Double => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelAsync")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancelAsync: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelAsync")(js.undefined)
        ret
    }
    @scala.inline
    def withCancelDebouncer(value: /* jobName */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelDebouncer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutCancelDebouncer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("cancelDebouncer")(js.undefined)
        ret
    }
    @scala.inline
    def withClassFollows(value: (/* name */ String, /* toElement */ HTMLElement, /* fromElement */ HTMLElement) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classFollows")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutClassFollows: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classFollows")(js.undefined)
        ret
    }
    @scala.inline
    def withCopyOwnProperty(value: (/* name */ String, /* source */ js.Object, /* target */ js.Object) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyOwnProperty")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutCopyOwnProperty: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("copyOwnProperty")(js.undefined)
        ret
    }
    @scala.inline
    def withCreate(value: (/* tag */ String, /* props */ js.Object) => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("create")(js.undefined)
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
    def withCreatedCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutCreatedCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createdCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withDebounce(value: (/* jobName */ String, /* callback */ js.Function, /* wait */ js.UndefOr[Double]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounce")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutDebounce: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("debounce")(js.undefined)
        ret
    }
    @scala.inline
    def withDeserialize(
      value: (js.Function2[/* value */ String, /* type */ NumberConstructor, Double]) with (js.Function2[/* value */ String, /* type */ BooleanConstructor, Boolean]) with (js.Function2[/* value */ String, /* type */ ObjectConstructor, js.Object]) with (js.Function2[/* value */ String, /* type */ ArrayConstructor, js.Array[_]]) with (js.Function2[/* value */ String, /* type */ DateConstructor, js.Date]) with (js.Function2[/* value */ String, /* type */ StringConstructor, String])
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDeserialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("deserialize")(js.undefined)
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
    def withDetachedCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachedCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDetachedCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("detachedCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withDistributeContent(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributeContent")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDistributeContent: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("distributeContent")(js.undefined)
        ret
    }
    @scala.inline
    def withDomHost(value: () => Element): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domHost")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutDomHost: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("domHost")(js.undefined)
        ret
    }
    @scala.inline
    def withElementMatches(value: (/* selector */ String, /* node */ js.UndefOr[Element]) => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementMatches")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutElementMatches: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("elementMatches")(js.undefined)
        ret
    }
    @scala.inline
    def withExtend(value: (/* prototype */ js.Object, /* api */ js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutExtend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extend")(js.undefined)
        ret
    }
    @scala.inline
    def withExtends(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutExtends: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("extends")(js.undefined)
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
    def withFire(
      value: (/* type */ String, /* detail */ js.UndefOr[js.Any], /* options */ js.UndefOr[js.Object]) => CustomEvent
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fire")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutFire: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("fire")(js.undefined)
        ret
    }
    @scala.inline
    def withFlushDebouncer(value: /* jobName */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushDebouncer")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutFlushDebouncer: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("flushDebouncer")(js.undefined)
        ret
    }
    @scala.inline
    def withGet(value: (/* path */ String | (js.Array[String | Double]), /* root */ js.UndefOr[js.Object]) => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutGet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("get")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContentChildNodes(value: /* selector */ String => js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentChildNodes")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetContentChildNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentChildNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetContentChildren(value: /* selector */ String => js.Array[HTMLElement]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentChildren")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetContentChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getContentChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEffectiveChildNodes(value: () => js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEffectiveChildNodes")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEffectiveChildNodes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEffectiveChildNodes")(js.undefined)
        ret
    }
    @scala.inline
    def withGetEffectiveChildren(value: () => js.Array[Node]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEffectiveChildren")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutGetEffectiveChildren: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getEffectiveChildren")(js.undefined)
        ret
    }
    @scala.inline
    def withGetNativePrototype(value: /* tag */ String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNativePrototype")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetNativePrototype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getNativePrototype")(js.undefined)
        ret
    }
    @scala.inline
    def withGetPropertyInfo(value: /* property */ String => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertyInfo")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutGetPropertyInfo: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getPropertyInfo")(js.undefined)
        ret
    }
    @scala.inline
    def withHostAttributes(value: StringDictionary[js.Any]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostAttributes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHostAttributes: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hostAttributes")(js.undefined)
        ret
    }
    @scala.inline
    def withImportHref(
      value: (/* href */ String, /* onload */ js.UndefOr[js.Function], /* onerror */ js.UndefOr[js.Function]) => HTMLLinkElement
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importHref")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutImportHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("importHref")(js.undefined)
        ret
    }
    @scala.inline
    def withInstanceTemplate(value: /* template */ HTMLElement => DocumentFragment): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTemplate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutInstanceTemplate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("instanceTemplate")(js.undefined)
        ret
    }
    @scala.inline
    def withIsDebouncerActive(value: /* jobName */ String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDebouncerActive")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsDebouncerActive: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isDebouncerActive")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLightDescendant(value: /* node */ HTMLElement => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLightDescendant")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsLightDescendant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLightDescendant")(js.undefined)
        ret
    }
    @scala.inline
    def withIsLocalDescendant(value: /* node */ HTMLElement => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocalDescendant")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutIsLocalDescendant: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isLocalDescendant")(js.undefined)
        ret
    }
    @scala.inline
    def withLinkPaths(value: (/* to */ String, /* from */ js.UndefOr[String]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkPaths")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutLinkPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("linkPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withListen(value: (/* node */ Element, /* eventName */ String, /* methodName */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutListen: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("listen")(js.undefined)
        ret
    }
    @scala.inline
    def withListeners(value: StringDictionary[String]): Self = {
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
    def withMixin(value: (/* target */ js.Object, /* source */ js.Object) => js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixin")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutMixin: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("mixin")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifyPath(value: (/* path */ String, /* value */ js.Any, /* fromAbove */ js.Any) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyPath")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutNotifyPath: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifyPath")(js.undefined)
        ret
    }
    @scala.inline
    def withNotifySplices(value: (/* path */ String, /* splices */ js.Array[PolymerSplice]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifySplices")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutNotifySplices: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("notifySplices")(js.undefined)
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
    def withPop(value: /* path */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutPop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("pop")(js.undefined)
        ret
    }
    @scala.inline
    def withProperties(value: StringDictionary[PropConstructorType | PropObjectType]): Self = {
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
    def withPush(value: (/* path */ String, /* repeated */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutPush: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("push")(js.undefined)
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
    @scala.inline
    def withReflectPropertiesToAttribute(value: /* name */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectPropertiesToAttribute")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutReflectPropertiesToAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("reflectPropertiesToAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withRegisterCallback(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerCallback")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRegisterCallback: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registerCallback")(js.undefined)
        ret
    }
    @scala.inline
    def withRegistered(value: () => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registered")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withoutRegistered: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("registered")(js.undefined)
        ret
    }
    @scala.inline
    def withResolveUrl(value: /* url */ String => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveUrl")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutResolveUrl: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("resolveUrl")(js.undefined)
        ret
    }
    @scala.inline
    def withScopeSubtree(value: (/* container */ Element, /* shouldObserve */ Boolean) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeSubtree")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutScopeSubtree: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeSubtree")(js.undefined)
        ret
    }
    @scala.inline
    def withSerialize(value: /* value */ js.Any => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutSerialize: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serialize")(js.undefined)
        ret
    }
    @scala.inline
    def withSerializeValueToAttribute(value: (/* value */ js.Any, /* attribute */ String, /* node */ js.UndefOr[Element]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeValueToAttribute")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSerializeValueToAttribute: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("serializeValueToAttribute")(js.undefined)
        ret
    }
    @scala.inline
    def withSet(
      value: (/* path */ String | (js.Array[String | Double]), /* value */ js.Any, /* root */ js.UndefOr[js.Object]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutSet: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("set")(js.undefined)
        ret
    }
    @scala.inline
    def withSetScrollDirection(value: (/* direction */ String, /* node */ js.UndefOr[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollDirection")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutSetScrollDirection: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("setScrollDirection")(js.undefined)
        ret
    }
    @scala.inline
    def withShift(value: /* path */ String => _): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutShift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("shift")(js.undefined)
        ret
    }
    @scala.inline
    def withSplice(
      value: (/* path */ String, /* index */ Double, /* removeCount */ Double, /* repeated */ js.Any) => Double
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splice")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutSplice: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("splice")(js.undefined)
        ret
    }
    @scala.inline
    def withToggleClass(
      value: (/* name */ String, /* bool */ js.UndefOr[Boolean], /* node */ js.UndefOr[HTMLElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleClass")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutToggleClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("toggleClass")(js.undefined)
        ret
    }
    @scala.inline
    def withTransform(value: (/* transform */ String, /* node */ js.UndefOr[HTMLElement]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutTransform: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("transform")(js.undefined)
        ret
    }
    @scala.inline
    def withTranslate3d(
      value: (/* x */ Double, /* y */ Double, /* z */ Double, /* node */ js.UndefOr[HTMLElement]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate3d")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withoutTranslate3d: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("translate3d")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlinkPaths(value: /* path */ String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlinkPaths")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUnlinkPaths: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlinkPaths")(js.undefined)
        ret
    }
    @scala.inline
    def withUnlisten(value: (/* node */ Element, /* eventName */ String, /* methodName */ String) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlisten")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUnlisten: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unlisten")(js.undefined)
        ret
    }
    @scala.inline
    def withUnshift(value: (/* path */ String, /* repeated */ js.Any) => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshift")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutUnshift: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("unshift")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateStyles(value: /* styles */ js.UndefOr[StringDictionary[String]] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateStyles")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutUpdateStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateStyles")(js.undefined)
        ret
    }
  }
  
}

