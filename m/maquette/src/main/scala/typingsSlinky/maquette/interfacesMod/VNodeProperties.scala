package typingsSlinky.maquette.interfacesMod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.DragEvent
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.FocusEvent
import org.scalajs.dom.raw.KeyboardEvent
import org.scalajs.dom.raw.MouseEvent
import org.scalajs.dom.raw.TouchEvent
import org.scalajs.dom.raw.UIEvent
import org.scalajs.dom.raw.WheelEvent
import typingsSlinky.maquette.anon.PartialCSSStyleDeclaratio
import typingsSlinky.maquette.maquetteStrings.`HintColon do not use GraveaccentclassNameGraveaccentComma use GraveaccentclassGraveaccent instead`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNodeProperties
  extends /**
  * Everything that is not explicitly listed (properties and attributes that are either uncommon or custom).
  */
/* index */ StringDictionary[js.Any] {
  val accessKey: js.UndefOr[String] = js.native
  val action: js.UndefOr[String] = js.native
  /**
    * Callback that is executed after this node is added to the DOM. Child nodes and properties have
    * already been applied.
    * @param element - The element that was added to the DOM.
    * @param projectionOptions - The projection options that were used, see [[createProjector]].
    * @param vnodeSelector - The selector passed to the [[h]] function.
    * @param properties - The properties passed to the [[h]] function.
    * @param children - The children that were created.
    */
  var afterCreate: js.UndefOr[
    js.Function5[
      /* element */ Element, 
      /* projectionOptions */ ProjectionOptions, 
      /* vnodeSelector */ String, 
      /* properties */ this.type, 
      /* children */ js.UndefOr[js.Array[VNode]], 
      Unit
    ]
  ] = js.native
  /**
    * Callback that is called when a node has been removed from the tree.
    * The callback is called during idle state or after a timeout (fallback).
    * {@link https://maquettejs.org/docs/dom-node-removal.html|More info}
    * @param element - The element that has been removed from the DOM.
    */
  var afterRemoved: js.UndefOr[js.Function1[/* element */ Element, Unit]] = js.native
  /**
    * Callback that is executed every time this node may have been updated. Child nodes and properties
    * have already been updated.
    * @param element - The element that may have been updated in the DOM.
    * @param projectionOptions - The projection options that were used, see [[createProjector]].
    * @param vnodeSelector - The selector passed to the [[h]] function.
    * @param properties - The properties passed to the [[h]] function.
    * @param children - The children for this node.
    */
  var afterUpdate: js.UndefOr[
    js.Function5[
      /* element */ Element, 
      /* projectionOptions */ ProjectionOptions, 
      /* vnodeSelector */ String, 
      /* properties */ this.type, 
      /* children */ js.UndefOr[js.Array[VNode]], 
      Unit
    ]
  ] = js.native
  val alt: js.UndefOr[String] = js.native
  val autocomplete: js.UndefOr[String] = js.native
  /**
    * When specified, the event handlers will be invoked with 'this' pointing to the value.
    * This is useful when using the prototype/class based implementation of MaquetteComponents.
    *
    * When no [[key]] is present, this object is also used to uniquely identify a DOM node.
    */
  val bind: js.UndefOr[js.Object] = js.native
  val checked: js.UndefOr[Boolean] = js.native
  val `class`: js.UndefOr[String] = js.native
  /**
    * Do not use className, use class instead
    */
  val className: js.UndefOr[
    `HintColon do not use GraveaccentclassNameGraveaccentComma use GraveaccentclassGraveaccent instead`
  ] = js.native
  /**
    * An object literal like `{important:true}` which allows css classes, like `important` to be added and removed
    * dynamically.
    */
  val classes: js.UndefOr[StringDictionary[js.UndefOr[Boolean | Null]]] = js.native
  val disabled: js.UndefOr[Boolean] = js.native
  val draggable: js.UndefOr[Boolean] = js.native
  val encoding: js.UndefOr[String] = js.native
  val enctype: js.UndefOr[String] = js.native
  /**
    * The animation to perform when this node is added to an already existing parent.
    * {@link http://maquettejs.org/docs/animations.html|More about animations}.
    * @param element - Element that was just added to the DOM.
    * @param properties - The properties object that was supplied to the [[h]] method
    */
  var enterAnimation: js.UndefOr[
    js.Function2[/* element */ Element, /* properties */ js.UndefOr[VNodeProperties], Unit]
  ] = js.native
  /**
    * The animation to perform when this node is removed while its parent remains.
    * @param element - Element that ought to be removed from to the DOM.
    * @param removeElement - Function that removes the element from the DOM.
    * This argument is provided purely for convenience.
    * You may use this function to remove the element when the animation is done.
    * @param properties - The properties object that was supplied to the [[h]] method that rendered this [[VNode]] the previous time.
    */
  var exitAnimation: js.UndefOr[
    js.Function3[
      /* element */ Element, 
      /* removeElement */ js.Function0[Unit], 
      /* properties */ js.UndefOr[this.type], 
      Unit
    ]
  ] = js.native
  val href: js.UndefOr[String] = js.native
  val id: js.UndefOr[String] = js.native
  /**
    * Puts a non-interactive string of html inside the DOM node.
    *
    * Note: if you use innerHTML, maquette cannot protect you from XSS vulnerabilities and you must make sure that the innerHTML value is safe.
    */
  val innerHTML: js.UndefOr[String] = js.native
  /**
    * Used to uniquely identify a DOM node among siblings.
    * A key is required when there are more children with the same selector and these children are added or removed dynamically.
    * NOTE: this does not have to be a string or number, a [[MaquetteComponent]] Object for instance is also common.
    */
  val key: js.UndefOr[js.Object] = js.native
  val method: js.UndefOr[String] = js.native
  val name: js.UndefOr[String] = js.native
  var onblur: js.UndefOr[js.Function1[/* ev */ FocusEvent, Boolean | Unit]] = js.native
  var onchange: js.UndefOr[js.Function1[/* ev */ Event, Boolean | Unit]] = js.native
  var onclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var ondblclick: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var ondrag: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var ondragend: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var ondragenter: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var ondragleave: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var ondragover: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var ondragstart: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var ondrop: js.UndefOr[js.Function1[/* ev */ DragEvent, Boolean | Unit]] = js.native
  var onfocus: js.UndefOr[js.Function1[/* ev */ FocusEvent, Boolean | Unit]] = js.native
  var oninput: js.UndefOr[js.Function1[/* ev */ Event, Boolean | Unit]] = js.native
  var onkeydown: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Boolean | Unit]] = js.native
  var onkeypress: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Boolean | Unit]] = js.native
  var onkeyup: js.UndefOr[js.Function1[/* ev */ KeyboardEvent, Boolean | Unit]] = js.native
  var onload: js.UndefOr[js.Function1[/* ev */ Event, Boolean | Unit]] = js.native
  var onmousedown: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmouseenter: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmouseleave: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmousemove: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmouseout: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmouseover: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmouseup: js.UndefOr[js.Function1[/* ev */ MouseEvent, Boolean | Unit]] = js.native
  var onmousewheel: js.UndefOr[js.Function1[/* ev */ WheelEvent, Boolean | Unit]] = js.native
  var onscroll: js.UndefOr[js.Function1[/* ev */ UIEvent, Boolean | Unit]] = js.native
  var onsubmit: js.UndefOr[js.Function1[/* ev */ Event, Boolean | Unit]] = js.native
  var ontouchcancel: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.native
  var ontouchend: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.native
  var ontouchmove: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.native
  var ontouchstart: js.UndefOr[js.Function1[/* ev */ TouchEvent, Boolean | Unit]] = js.native
  val placeholder: js.UndefOr[String] = js.native
  val readOnly: js.UndefOr[Boolean] = js.native
  val rel: js.UndefOr[String] = js.native
  val spellcheck: js.UndefOr[Boolean] = js.native
  val src: js.UndefOr[String] = js.native
  val srcset: js.UndefOr[String] = js.native
  /**
    * An object literal like `{height:'100px'}` which allows styles to be changed dynamically. All values must be strings.
    */
  val styles: js.UndefOr[PartialCSSStyleDeclaratio] = js.native
  val tabIndex: js.UndefOr[Double] = js.native
  val target: js.UndefOr[String] = js.native
  val title: js.UndefOr[String] = js.native
  val `type`: js.UndefOr[String] = js.native
  /**
    * The animation to perform when the properties of this node change.
    * This also includes attributes, styles, css classes. This callback is also invoked when node contains only text and that text changes.
    * {@link http://maquettejs.org/docs/animations.html|More about animations}.
    * @param element - Element that was modified in the DOM.
    * @param properties - The last properties object that was supplied to the [[h]] method
    * @param previousProperties - The previous properties object that was supplied to the [[h]] method
    */
  var updateAnimation: js.UndefOr[
    js.Function3[
      /* element */ Element, 
      /* properties */ js.UndefOr[this.type], 
      /* previousProperties */ js.UndefOr[this.type], 
      Unit
    ]
  ] = js.native
  val value: js.UndefOr[String] = js.native
}

object VNodeProperties {
  @scala.inline
  def apply(): VNodeProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VNodeProperties]
  }
  @scala.inline
  implicit class VNodePropertiesOps[Self <: VNodeProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAccessKey(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAccessKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("accessKey")(js.undefined)
        ret
    }
    @scala.inline
    def withAction(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAction: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("action")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterCreate(
      value: (/* element */ Element, /* projectionOptions */ ProjectionOptions, /* vnodeSelector */ String, VNodeProperties, /* children */ js.UndefOr[js.Array[VNode]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreate")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAfterCreate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterCreate")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterRemoved(value: /* element */ Element => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoved")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutAfterRemoved: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterRemoved")(js.undefined)
        ret
    }
    @scala.inline
    def withAfterUpdate(
      value: (/* element */ Element, /* projectionOptions */ ProjectionOptions, /* vnodeSelector */ String, VNodeProperties, /* children */ js.UndefOr[js.Array[VNode]]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(js.Any.fromFunction5(value))
        ret
    }
    @scala.inline
    def withoutAfterUpdate: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("afterUpdate")(js.undefined)
        ret
    }
    @scala.inline
    def withAlt(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAlt: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("alt")(js.undefined)
        ret
    }
    @scala.inline
    def withAutocomplete(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutAutocomplete: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("autocomplete")(js.undefined)
        ret
    }
    @scala.inline
    def withBind(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutBind: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bind")(js.undefined)
        ret
    }
    @scala.inline
    def withChecked(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutChecked: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("checked")(js.undefined)
        ret
    }
    @scala.inline
    def withClass(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClass: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("class")(js.undefined)
        ret
    }
    @scala.inline
    def withClassName(
      value: scala.Nothing | (`HintColon do not use GraveaccentclassNameGraveaccentComma use GraveaccentclassGraveaccent instead`)
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClassName: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("className")(js.undefined)
        ret
    }
    @scala.inline
    def withClasses(value: StringDictionary[js.UndefOr[Boolean | Null]]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutClasses: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("classes")(js.undefined)
        ret
    }
    @scala.inline
    def withDisabled(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDisabled: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("disabled")(js.undefined)
        ret
    }
    @scala.inline
    def withDraggable(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutDraggable: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("draggable")(js.undefined)
        ret
    }
    @scala.inline
    def withEncoding(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEncoding: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("encoding")(js.undefined)
        ret
    }
    @scala.inline
    def withEnctype(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enctype")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutEnctype: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enctype")(js.undefined)
        ret
    }
    @scala.inline
    def withEnterAnimation(value: (/* element */ Element, /* properties */ js.UndefOr[VNodeProperties]) => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAnimation")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withoutEnterAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("enterAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withExitAnimation(
      value: (/* element */ Element, /* removeElement */ js.Function0[Unit], /* properties */ js.UndefOr[VNodeProperties]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitAnimation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutExitAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("exitAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withHref(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutHref: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("href")(js.undefined)
        ret
    }
    @scala.inline
    def withId(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutId: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("id")(js.undefined)
        ret
    }
    @scala.inline
    def withInnerHTML(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInnerHTML: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("innerHTML")(js.undefined)
        ret
    }
    @scala.inline
    def withKey(value: js.Object): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutKey: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("key")(js.undefined)
        ret
    }
    @scala.inline
    def withMethod(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutMethod: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("method")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self = {
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
    def withOnblur(value: /* ev */ FocusEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnblur: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onblur")(js.undefined)
        ret
    }
    @scala.inline
    def withOnchange(value: /* ev */ Event => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnchange: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onchange")(js.undefined)
        ret
    }
    @scala.inline
    def withOnclick(value: /* ev */ MouseEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOndblclick(value: /* ev */ MouseEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondblclick")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndblclick: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondblclick")(js.undefined)
        ret
    }
    @scala.inline
    def withOndrag(value: /* ev */ DragEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrag")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndrag: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrag")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragend(value: /* ev */ DragEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndragend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragend")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragenter(value: /* ev */ DragEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndragenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragenter")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragleave(value: /* ev */ DragEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragleave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndragleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragleave")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragover(value: /* ev */ DragEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndragover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragover")(js.undefined)
        ret
    }
    @scala.inline
    def withOndragstart(value: /* ev */ DragEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndragstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondragstart")(js.undefined)
        ret
    }
    @scala.inline
    def withOndrop(value: /* ev */ DragEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrop")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOndrop: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ondrop")(js.undefined)
        ret
    }
    @scala.inline
    def withOnfocus(value: /* ev */ FocusEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocus")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnfocus: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onfocus")(js.undefined)
        ret
    }
    @scala.inline
    def withOninput(value: /* ev */ Event => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninput")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOninput: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("oninput")(js.undefined)
        ret
    }
    @scala.inline
    def withOnkeydown(value: /* ev */ KeyboardEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeydown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnkeydown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeydown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnkeypress(value: /* ev */ KeyboardEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeypress")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnkeypress: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeypress")(js.undefined)
        ret
    }
    @scala.inline
    def withOnkeyup(value: /* ev */ KeyboardEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeyup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnkeyup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onkeyup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnload(value: /* ev */ Event => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnload: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onload")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmousedown(value: /* ev */ MouseEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousedown")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmousedown: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousedown")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseenter(value: /* ev */ MouseEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseenter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmouseenter: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseenter")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseleave(value: /* ev */ MouseEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseleave")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmouseleave: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseleave")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmousemove(value: /* ev */ MouseEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousemove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmousemove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousemove")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseout(value: /* ev */ MouseEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmouseout: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseout")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseover(value: /* ev */ MouseEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmouseover: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseover")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmouseup(value: /* ev */ MouseEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseup")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmouseup: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmouseup")(js.undefined)
        ret
    }
    @scala.inline
    def withOnmousewheel(value: /* ev */ WheelEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousewheel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnmousewheel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onmousewheel")(js.undefined)
        ret
    }
    @scala.inline
    def withOnscroll(value: /* ev */ UIEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onscroll")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnscroll: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onscroll")(js.undefined)
        ret
    }
    @scala.inline
    def withOnsubmit(value: /* ev */ Event => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsubmit")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOnsubmit: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("onsubmit")(js.undefined)
        ret
    }
    @scala.inline
    def withOntouchcancel(value: /* ev */ TouchEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchcancel")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOntouchcancel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchcancel")(js.undefined)
        ret
    }
    @scala.inline
    def withOntouchend(value: /* ev */ TouchEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchend")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOntouchend: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchend")(js.undefined)
        ret
    }
    @scala.inline
    def withOntouchmove(value: /* ev */ TouchEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchmove")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOntouchmove: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchmove")(js.undefined)
        ret
    }
    @scala.inline
    def withOntouchstart(value: /* ev */ TouchEvent => Boolean | Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchstart")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withoutOntouchstart: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ontouchstart")(js.undefined)
        ret
    }
    @scala.inline
    def withPlaceholder(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutPlaceholder: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("placeholder")(js.undefined)
        ret
    }
    @scala.inline
    def withReadOnly(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutReadOnly: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("readOnly")(js.undefined)
        ret
    }
    @scala.inline
    def withRel(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRel: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("rel")(js.undefined)
        ret
    }
    @scala.inline
    def withSpellcheck(value: Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSpellcheck: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("spellcheck")(js.undefined)
        ret
    }
    @scala.inline
    def withSrc(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrc: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("src")(js.undefined)
        ret
    }
    @scala.inline
    def withSrcset(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcset")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutSrcset: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("srcset")(js.undefined)
        ret
    }
    @scala.inline
    def withStyles(value: PartialCSSStyleDeclaratio): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutStyles: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("styles")(js.undefined)
        ret
    }
    @scala.inline
    def withTabIndex(value: Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTabIndex: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("tabIndex")(js.undefined)
        ret
    }
    @scala.inline
    def withTarget(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTarget: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("target")(js.undefined)
        ret
    }
    @scala.inline
    def withTitle(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutTitle: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("title")(js.undefined)
        ret
    }
    @scala.inline
    def withType(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutType: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("type")(js.undefined)
        ret
    }
    @scala.inline
    def withUpdateAnimation(
      value: (/* element */ Element, /* properties */ js.UndefOr[VNodeProperties], /* previousProperties */ js.UndefOr[VNodeProperties]) => Unit
    ): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAnimation")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withoutUpdateAnimation: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("updateAnimation")(js.undefined)
        ret
    }
    @scala.inline
    def withValue(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutValue: Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("value")(js.undefined)
        ret
    }
  }
  
}

