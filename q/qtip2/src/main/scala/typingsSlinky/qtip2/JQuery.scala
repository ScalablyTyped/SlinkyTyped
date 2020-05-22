package typingsSlinky.qtip2

import org.scalajs.dom.raw.Event
import typingsSlinky.qtip2.QTip2.Api
import typingsSlinky.qtip2.QTip2.Content
import typingsSlinky.qtip2.QTip2.EventApiFunc
import typingsSlinky.qtip2.QTip2.Events
import typingsSlinky.qtip2.QTip2.Hide
import typingsSlinky.qtip2.QTip2.Modal
import typingsSlinky.qtip2.QTip2.Plugin
import typingsSlinky.qtip2.QTip2.Position
import typingsSlinky.qtip2.QTip2.PositionAdjust
import typingsSlinky.qtip2.QTip2.QTipOptions
import typingsSlinky.qtip2.QTip2.Show
import typingsSlinky.qtip2.QTip2.Style
import typingsSlinky.qtip2.QTip2.Target
import typingsSlinky.qtip2.QTip2.Text
import typingsSlinky.qtip2.QTip2.Tip
import typingsSlinky.qtip2.QTip2.Title
import typingsSlinky.qtip2.qtip2Strings.api
import typingsSlinky.qtip2.qtip2Strings.blur
import typingsSlinky.qtip2.qtip2Strings.content
import typingsSlinky.qtip2.qtip2Strings.contentDotattr
import typingsSlinky.qtip2.qtip2Strings.contentDotbutton
import typingsSlinky.qtip2.qtip2Strings.contentDottext
import typingsSlinky.qtip2.qtip2Strings.contentDottitle
import typingsSlinky.qtip2.qtip2Strings.destroy
import typingsSlinky.qtip2.qtip2Strings.disable
import typingsSlinky.qtip2.qtip2Strings.enable
import typingsSlinky.qtip2.qtip2Strings.events
import typingsSlinky.qtip2.qtip2Strings.eventsDotblur
import typingsSlinky.qtip2.qtip2Strings.eventsDotfocus
import typingsSlinky.qtip2.qtip2Strings.eventsDothidden
import typingsSlinky.qtip2.qtip2Strings.eventsDothide
import typingsSlinky.qtip2.qtip2Strings.eventsDotmove
import typingsSlinky.qtip2.qtip2Strings.eventsDotrender
import typingsSlinky.qtip2.qtip2Strings.eventsDotshow
import typingsSlinky.qtip2.qtip2Strings.eventsDottoggle
import typingsSlinky.qtip2.qtip2Strings.eventsDotvisible
import typingsSlinky.qtip2.qtip2Strings.focus
import typingsSlinky.qtip2.qtip2Strings.hide
import typingsSlinky.qtip2.qtip2Strings.hideDotdelay
import typingsSlinky.qtip2.qtip2Strings.hideDotdistance
import typingsSlinky.qtip2.qtip2Strings.hideDoteffect
import typingsSlinky.qtip2.qtip2Strings.hideDotevent
import typingsSlinky.qtip2.qtip2Strings.hideDotfixed
import typingsSlinky.qtip2.qtip2Strings.hideDotinactive
import typingsSlinky.qtip2.qtip2Strings.hideDotleave
import typingsSlinky.qtip2.qtip2Strings.hideDottarget
import typingsSlinky.qtip2.qtip2Strings.id
import typingsSlinky.qtip2.qtip2Strings.metadata
import typingsSlinky.qtip2.qtip2Strings.option
import typingsSlinky.qtip2.qtip2Strings.overwrite
import typingsSlinky.qtip2.qtip2Strings.position
import typingsSlinky.qtip2.qtip2Strings.positionDotadjust
import typingsSlinky.qtip2.qtip2Strings.positionDotat
import typingsSlinky.qtip2.qtip2Strings.positionDotcontainer
import typingsSlinky.qtip2.qtip2Strings.positionDoteffect
import typingsSlinky.qtip2.qtip2Strings.positionDotmy
import typingsSlinky.qtip2.qtip2Strings.positionDottarget
import typingsSlinky.qtip2.qtip2Strings.positionDotviewport
import typingsSlinky.qtip2.qtip2Strings.prerender
import typingsSlinky.qtip2.qtip2Strings.reposition
import typingsSlinky.qtip2.qtip2Strings.show
import typingsSlinky.qtip2.qtip2Strings.showDotdelay
import typingsSlinky.qtip2.qtip2Strings.showDoteffect
import typingsSlinky.qtip2.qtip2Strings.showDotevent
import typingsSlinky.qtip2.qtip2Strings.showDotmodal
import typingsSlinky.qtip2.qtip2Strings.showDotready
import typingsSlinky.qtip2.qtip2Strings.showDotsolo
import typingsSlinky.qtip2.qtip2Strings.showDottarget
import typingsSlinky.qtip2.qtip2Strings.style
import typingsSlinky.qtip2.qtip2Strings.styleDotclasses
import typingsSlinky.qtip2.qtip2Strings.styleDotdef
import typingsSlinky.qtip2.qtip2Strings.styleDotheight
import typingsSlinky.qtip2.qtip2Strings.styleDottip
import typingsSlinky.qtip2.qtip2Strings.styleDotwidget
import typingsSlinky.qtip2.qtip2Strings.styleDotwidth
import typingsSlinky.qtip2.qtip2Strings.suppress
import typingsSlinky.qtip2.qtip2Strings.toggle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JQuery extends js.Object {
  @JSName("qtip")
  var qtip_Original: Plugin = js.native
  def qtip(): JQuery = js.native
  def qtip(methodName: String): js.Any = js.native
  def qtip(methodName: String, p1: js.Any): js.Any = js.native
  def qtip(methodName: String, p1: js.Any, p2: js.Any): js.Any = js.native
  def qtip(methodName: String, p1: js.Any, p2: js.Any, p3: js.Any): js.Any = js.native
  def qtip(methodName: option, propertyName: content): Content = js.native
  def qtip(methodName: option, propertyName: contentDotattr): String = js.native
  def qtip(methodName: option, propertyName: contentDotattr, value: String): Api = js.native
  def qtip(methodName: option, propertyName: contentDotbutton): String | JQuery | Boolean = js.native
  def qtip(methodName: option, propertyName: contentDotbutton, value: String): Api = js.native
  def qtip(methodName: option, propertyName: contentDotbutton, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: contentDotbutton, value: JQuery): Api = js.native
  def qtip(methodName: option, propertyName: contentDottext): Text = js.native
  def qtip(methodName: option, propertyName: contentDottext, value: Text): Api = js.native
  def qtip(methodName: option, propertyName: contentDottitle): Title = js.native
  def qtip(methodName: option, propertyName: contentDottitle, value: Title): Api = js.native
  def qtip(methodName: option, propertyName: contentDottitle, value: typingsSlinky.qtip2.anon.Text): Api = js.native
  def qtip(methodName: option, propertyName: content, value: Content): Api = js.native
  def qtip(methodName: option, propertyName: content, value: Text): Api = js.native
  def qtip(methodName: option, propertyName: events): Events = js.native
  def qtip(methodName: option, propertyName: eventsDotblur): EventApiFunc = js.native
  def qtip(methodName: option, propertyName: eventsDotblur, value: EventApiFunc): Api = js.native
  def qtip(methodName: option, propertyName: eventsDotfocus): EventApiFunc = js.native
  def qtip(methodName: option, propertyName: eventsDotfocus, value: EventApiFunc): Api = js.native
  def qtip(methodName: option, propertyName: eventsDothidden): EventApiFunc = js.native
  def qtip(methodName: option, propertyName: eventsDothidden, value: EventApiFunc): Api = js.native
  def qtip(methodName: option, propertyName: eventsDothide): EventApiFunc = js.native
  def qtip(methodName: option, propertyName: eventsDothide, value: EventApiFunc): Api = js.native
  def qtip(methodName: option, propertyName: eventsDotmove): EventApiFunc = js.native
  def qtip(methodName: option, propertyName: eventsDotmove, value: EventApiFunc): Api = js.native
  def qtip(methodName: option, propertyName: eventsDotrender): EventApiFunc = js.native
  def qtip(methodName: option, propertyName: eventsDotrender, value: EventApiFunc): Api = js.native
  def qtip(methodName: option, propertyName: eventsDotshow): EventApiFunc = js.native
  def qtip(methodName: option, propertyName: eventsDotshow, value: EventApiFunc): Api = js.native
  def qtip(methodName: option, propertyName: eventsDottoggle): EventApiFunc = js.native
  def qtip(methodName: option, propertyName: eventsDottoggle, value: EventApiFunc): Api = js.native
  def qtip(methodName: option, propertyName: eventsDotvisible): EventApiFunc = js.native
  def qtip(methodName: option, propertyName: eventsDotvisible, value: EventApiFunc): Api = js.native
  def qtip(methodName: option, propertyName: events, value: Events): Api = js.native
  def qtip(methodName: option, propertyName: hide): Hide = js.native
  def qtip(methodName: option, propertyName: hideDotdelay): Double = js.native
  def qtip(methodName: option, propertyName: hideDotdistance): Double | Boolean = js.native
  def qtip(methodName: option, propertyName: hideDotdistance, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: hideDotdistance, value: Double): Api = js.native
  def qtip(methodName: option, propertyName: hideDoteffect): Boolean | (js.Function1[/* offset */ js.Any, Unit]) = js.native
  def qtip(methodName: option, propertyName: hideDoteffect, value: js.Function1[/* offset */ js.Any, Unit]): Api = js.native
  def qtip(methodName: option, propertyName: hideDoteffect, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: hideDotevent): String | Boolean = js.native
  def qtip(methodName: option, propertyName: hideDotevent, value: String): Api = js.native
  def qtip(methodName: option, propertyName: hideDotevent, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: hideDotfixed, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: hideDotinactive, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: hideDotinactive, value: Double): Api = js.native
  def qtip(methodName: option, propertyName: hideDotleave): String | Boolean = js.native
  def qtip(methodName: option, propertyName: hideDotleave, value: String): Api = js.native
  def qtip(methodName: option, propertyName: hideDotleave, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: hideDottarget): JQuery | Boolean = js.native
  def qtip(methodName: option, propertyName: hideDottarget, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: hideDottarget, value: JQuery): Api = js.native
  def qtip(methodName: option, propertyName: hide, value: Hide): Api = js.native
  def qtip(methodName: option, propertyName: id): String | Boolean = js.native
  def qtip(methodName: option, propertyName: id, value: String): Api = js.native
  def qtip(methodName: option, propertyName: id, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: metadata): js.Any = js.native
  def qtip(methodName: option, propertyName: metadata, value: js.Any): Api = js.native
  def qtip(methodName: option, propertyName: overwrite): Boolean = js.native
  def qtip(methodName: option, propertyName: overwrite, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: position): Position = js.native
  def qtip(methodName: option, propertyName: positionDotadjust): PositionAdjust = js.native
  def qtip(methodName: option, propertyName: positionDotadjust, value: PositionAdjust): Api = js.native
  def qtip(methodName: option, propertyName: positionDotat): String | Boolean = js.native
  def qtip(methodName: option, propertyName: positionDotat, value: String): Api = js.native
  def qtip(methodName: option, propertyName: positionDotat, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: positionDotcontainer): JQuery | Boolean = js.native
  def qtip(methodName: option, propertyName: positionDotcontainer, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: positionDotcontainer, value: JQuery): Api = js.native
  def qtip(methodName: option, propertyName: positionDoteffect): Boolean | (js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit]) = js.native
  def qtip(
    methodName: option,
    propertyName: positionDoteffect,
    value: js.Function3[/* api */ Api, /* pos */ js.Any, /* viewport */ js.Any, Unit]
  ): Api = js.native
  def qtip(methodName: option, propertyName: positionDoteffect, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: positionDotmy): String | Boolean = js.native
  def qtip(methodName: option, propertyName: positionDotmy, value: String): Api = js.native
  def qtip(methodName: option, propertyName: positionDotmy, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: positionDottarget): Target | Boolean = js.native
  def qtip(methodName: option, propertyName: positionDottarget, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: positionDottarget, value: Target): Api = js.native
  def qtip(methodName: option, propertyName: positionDotviewport): JQuery | Boolean = js.native
  def qtip(methodName: option, propertyName: positionDotviewport, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: positionDotviewport, value: JQuery): Api = js.native
  def qtip(methodName: option, propertyName: position, value: Position): Api = js.native
  def qtip(methodName: option, propertyName: prerender): Boolean = js.native
  def qtip(methodName: option, propertyName: prerender, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: show): Show = js.native
  def qtip(methodName: option, propertyName: showDotdelay): Double = js.native
  def qtip(methodName: option, propertyName: showDotdelay, value: Double): Api = js.native
  def qtip(methodName: option, propertyName: showDoteffect): Boolean | (js.Function1[/* offset */ js.Any, Unit]) = js.native
  def qtip(methodName: option, propertyName: showDoteffect, value: js.Function1[/* offset */ js.Any, Unit]): Api = js.native
  def qtip(methodName: option, propertyName: showDoteffect, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: showDotevent): String | Boolean = js.native
  def qtip(methodName: option, propertyName: showDotevent, value: String): Api = js.native
  def qtip(methodName: option, propertyName: showDotevent, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: showDotmodal): Boolean | Modal = js.native
  def qtip(methodName: option, propertyName: showDotmodal, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: showDotmodal, value: Modal): Api = js.native
  def qtip(methodName: option, propertyName: showDotready): Boolean = js.native
  def qtip(methodName: option, propertyName: showDotready, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: showDotsolo): JQuery | String | Boolean = js.native
  def qtip(methodName: option, propertyName: showDotsolo, value: String): Api = js.native
  def qtip(methodName: option, propertyName: showDotsolo, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: showDotsolo, value: JQuery): Api = js.native
  def qtip(methodName: option, propertyName: showDottarget): JQuery | Boolean = js.native
  def qtip(methodName: option, propertyName: showDottarget, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: showDottarget, value: JQuery): Api = js.native
  def qtip(methodName: option, propertyName: show, value: Show): Api = js.native
  def qtip(methodName: option, propertyName: style): Style = js.native
  def qtip(methodName: option, propertyName: styleDotclasses): String | Boolean = js.native
  def qtip(methodName: option, propertyName: styleDotclasses, value: String): Api = js.native
  def qtip(methodName: option, propertyName: styleDotclasses, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: styleDotdef): Boolean = js.native
  def qtip(methodName: option, propertyName: styleDotdef, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: styleDotheight): String | Double | Boolean = js.native
  def qtip(methodName: option, propertyName: styleDotheight, value: String): Api = js.native
  def qtip(methodName: option, propertyName: styleDotheight, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: styleDotheight, value: Double): Api = js.native
  def qtip(methodName: option, propertyName: styleDottip): String | Boolean | Tip = js.native
  def qtip(methodName: option, propertyName: styleDottip, value: String): Api = js.native
  def qtip(methodName: option, propertyName: styleDottip, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: styleDottip, value: Tip): Api = js.native
  def qtip(methodName: option, propertyName: styleDotwidget): Boolean = js.native
  def qtip(methodName: option, propertyName: styleDotwidget, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: styleDotwidth): String | Double | Boolean = js.native
  def qtip(methodName: option, propertyName: styleDotwidth, value: String): Api = js.native
  def qtip(methodName: option, propertyName: styleDotwidth, value: Boolean): Api = js.native
  def qtip(methodName: option, propertyName: styleDotwidth, value: Double): Api = js.native
  def qtip(methodName: option, propertyName: style, value: Style): Api = js.native
  def qtip(methodName: option, propertyName: suppress): Boolean = js.native
  def qtip(methodName: option, propertyName: suppress, value: Boolean): Api = js.native
  def qtip(options: QTipOptions): JQuery = js.native
  @JSName("qtip")
  def qtip_api(methodName: api): Api = js.native
  @JSName("qtip")
  def qtip_blur(methodName: blur): JQuery = js.native
  @JSName("qtip")
  def qtip_blur(methodName: blur, event: Event): JQuery = js.native
  @JSName("qtip")
  def qtip_destroy(methodName: destroy): JQuery = js.native
  @JSName("qtip")
  def qtip_destroy(methodName: destroy, immediate: Boolean): JQuery = js.native
  @JSName("qtip")
  def qtip_disable(methodName: disable): JQuery = js.native
  @JSName("qtip")
  def qtip_disable(methodName: disable, state: Boolean): JQuery = js.native
  @JSName("qtip")
  def qtip_enable(methodName: enable): JQuery = js.native
  @JSName("qtip")
  def qtip_focus(methodName: focus): JQuery = js.native
  @JSName("qtip")
  def qtip_focus(methodName: focus, event: Event): JQuery = js.native
  @JSName("qtip")
  def qtip_hide(methodName: hide): JQuery = js.native
  @JSName("qtip")
  def qtip_hide(methodName: hide, event: Event): JQuery = js.native
  @JSName("qtip")
  def qtip_option(methodName: option, properties: QTipOptions): Api = js.native
  @JSName("qtip")
  def qtip_reposition(methodName: reposition): JQuery = js.native
  @JSName("qtip")
  def qtip_reposition(methodName: reposition, event: Event): JQuery = js.native
  @JSName("qtip")
  def qtip_reposition(methodName: reposition, event: Event, effect: Boolean): JQuery = js.native
  @JSName("qtip")
  def qtip_show(methodName: show): JQuery = js.native
  @JSName("qtip")
  def qtip_show(methodName: show, event: Event): JQuery = js.native
  @JSName("qtip")
  def qtip_toggle(methodName: toggle): JQuery = js.native
  @JSName("qtip")
  def qtip_toggle(methodName: toggle, state: Boolean): JQuery = js.native
  @JSName("qtip")
  def qtip_toggle(methodName: toggle, state: Boolean, event: Event): JQuery = js.native
}

