package typingsSlinky.reachMenuButton

import org.scalajs.dom.raw.Event
import org.scalajs.dom.raw.EventTarget
import org.scalajs.dom.raw.HTMLButtonElement
import org.scalajs.dom.raw.HTMLDivElement
import org.scalajs.dom.raw.HTMLElement
import slinky.core.ReactComponentClass
import slinky.core.SyntheticEvent
import slinky.core.facade.ReactElement
import slinky.core.facade.ReactRef
import slinky.web.SyntheticAnimationEvent
import slinky.web.SyntheticClipboardEvent
import slinky.web.SyntheticCompositionEvent
import slinky.web.SyntheticFocusEvent
import slinky.web.SyntheticKeyboardEvent
import slinky.web.SyntheticMouseEvent
import slinky.web.SyntheticPointerEvent
import slinky.web.SyntheticTouchEvent
import slinky.web.SyntheticTransitionEvent
import slinky.web.SyntheticUIEvent
import slinky.web.SyntheticWheelEvent
import typingsSlinky.reachMenuButton.anon.As
import typingsSlinky.reachMenuButton.anon.Children
import typingsSlinky.reachMenuButton.anon.PartialState
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.`additions removals`
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.`additions text`
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.`inline`
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.`object`
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.`removals additions`
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.`removals text`
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.`text additions`
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.`text removals`
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.`var`
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.a
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.abbr
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.additions
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.address
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.all
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.animate
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.animateMotion
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.animateTransform
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.area
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.article
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.ascending
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.aside
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.assertive
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.audio
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.b
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.base
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.bdi
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.bdo
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.big
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.blockquote
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.body
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.both
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.br
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.button
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.canvas
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.caption
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.circle
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.cite
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.clipPath
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.code
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.col
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.colgroup
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.copy
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.data
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.datalist
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.date
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.dd
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.decimal
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.defs
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.del
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.desc
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.descending
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.details
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.dfn
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.dialog
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.div
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.dl
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.dt
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.ellipse
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.em
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.email
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.embed
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.execute
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feBlend
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feColorMatrix
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feComponentTransfer
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feComposite
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feConvolveMatrix
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feDiffuseLighting
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feDisplacementMap
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feDistantLight
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feDropShadow
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feFlood
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feFuncA
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feFuncB
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feFuncG
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feFuncR
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feGaussianBlur
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feImage
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feMerge
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feMergeNode
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feMorphology
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feOffset
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.fePointLight
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feSpecularLighting
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feSpotLight
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feTile
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.feTurbulence
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.fieldset
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.figcaption
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.figure
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.filter
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.footer
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.foreignObject
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.form
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.g
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.grammar
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.grid
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.h1
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.h2
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.h3
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.h4
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.h5
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.h6
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.head
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.header
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.hgroup
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.horizontal
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.hr
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.html
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.i
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.iframe
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.image
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.img
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.inherit
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.input
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.ins
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.kbd
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.keygen
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.label
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.legend
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.li
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.line
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.linearGradient
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.link
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.list
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.listbox
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.location
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.main
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.map
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.mark
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.marker
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.mask
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.menu
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.menuitem
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.meta
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.metadata
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.meter
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.mixed
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.move
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.mpath
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.nav
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.no
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.noindex
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.none
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.noscript
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.numeric
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.off
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.ol
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.on
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.optgroup
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.option
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.other
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.output
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.p
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.page
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.param
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.path
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.pattern
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.picture
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.polite
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.polygon
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.polyline
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.popup
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.pre
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.progress
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.q
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.radialGradient
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.rect
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.removals
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.rp
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.rt
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.ruby
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.s
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.samp
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.script
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.search
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.section
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.select
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.slot
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.small
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.source
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.span
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.spelling
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.step
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.stop
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.strong
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.style
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.sub
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.summary
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.sup
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.svg
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.switch
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.symbol
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.table
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.tbody
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.td
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.tel
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.template
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.text
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.textPath
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.textarea
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.tfoot
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.th
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.thead
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.time
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.title
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.tr
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.track
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.tree
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.tspan
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.u
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.ul
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.url
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.use
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.vertical
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.video
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.view
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.wbr
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.webview
import typingsSlinky.reachMenuButton.reachMenuButtonStrings.yes
import typingsSlinky.react.anon.Html
import typingsSlinky.react.mod.AnimationEventHandler
import typingsSlinky.react.mod.Booleanish
import typingsSlinky.react.mod.CSSProperties
import typingsSlinky.react.mod.ClipboardEventHandler
import typingsSlinky.react.mod.CompositionEventHandler
import typingsSlinky.react.mod.DetailedHTMLProps
import typingsSlinky.react.mod.DragEvent
import typingsSlinky.react.mod.DragEventHandler
import typingsSlinky.react.mod.FocusEventHandler
import typingsSlinky.react.mod.FormEventHandler
import typingsSlinky.react.mod.HTMLAttributes
import typingsSlinky.react.mod.Key
import typingsSlinky.react.mod.KeyboardEventHandler
import typingsSlinky.react.mod.LegacyRef
import typingsSlinky.react.mod.MouseEventHandler
import typingsSlinky.react.mod.PointerEventHandler
import typingsSlinky.react.mod.ReactEventHandler
import typingsSlinky.react.mod.TouchEventHandler
import typingsSlinky.react.mod.TransitionEventHandler
import typingsSlinky.react.mod.UIEventHandler
import typingsSlinky.react.mod.WheelEventHandler
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@reach/menu-button", "Menu")
  @js.native
  val Menu: ReactComponentClass[MenuProps] = js.native
  
  @JSImport("@reach/menu-button", "MenuButton")
  @js.native
  val MenuButton: ReactComponentClass[MenuButtonProps] = js.native
  
  @JSImport("@reach/menu-button", "MenuItem")
  @js.native
  val MenuItem: ReactComponentClass[MenuItemProps] = js.native
  
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink[T /* <: js.Object */](props: MenuLinkProps[T]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_a(props: MenuLinkProps[a]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_abbr(props: MenuLinkProps[abbr]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_address(props: MenuLinkProps[address]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_animate(props: MenuLinkProps[animate]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_animateMotion(props: MenuLinkProps[animateMotion]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_animateTransform(props: MenuLinkProps[animateTransform]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_area(props: MenuLinkProps[area]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_article(props: MenuLinkProps[article]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_aside(props: MenuLinkProps[aside]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_audio(props: MenuLinkProps[audio]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_b(props: MenuLinkProps[b]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_base(props: MenuLinkProps[base]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_bdi(props: MenuLinkProps[bdi]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_bdo(props: MenuLinkProps[bdo]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_big(props: MenuLinkProps[big]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_blockquote(props: MenuLinkProps[blockquote]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_body(props: MenuLinkProps[body]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_br(props: MenuLinkProps[br]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_button(props: MenuLinkProps[button]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_canvas(props: MenuLinkProps[canvas]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_caption(props: MenuLinkProps[caption]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_circle(props: MenuLinkProps[circle]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_cite(props: MenuLinkProps[cite]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_clipPath(props: MenuLinkProps[clipPath]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_code(props: MenuLinkProps[code]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_col(props: MenuLinkProps[col]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_colgroup(props: MenuLinkProps[colgroup]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_data(props: MenuLinkProps[data]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_datalist(props: MenuLinkProps[datalist]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_dd(props: MenuLinkProps[dd]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_defs(props: MenuLinkProps[defs]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_del(props: MenuLinkProps[del]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_desc(props: MenuLinkProps[desc]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_details(props: MenuLinkProps[details]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_dfn(props: MenuLinkProps[dfn]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_dialog(props: MenuLinkProps[dialog]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_div(props: MenuLinkProps[div]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_dl(props: MenuLinkProps[dl]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_dt(props: MenuLinkProps[dt]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_ellipse(props: MenuLinkProps[ellipse]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_em(props: MenuLinkProps[em]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_embed(props: MenuLinkProps[embed]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feBlend(props: MenuLinkProps[feBlend]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feColorMatrix(props: MenuLinkProps[feColorMatrix]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feComponentTransfer(props: MenuLinkProps[feComponentTransfer]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feComposite(props: MenuLinkProps[feComposite]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feConvolveMatrix(props: MenuLinkProps[feConvolveMatrix]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feDiffuseLighting(props: MenuLinkProps[feDiffuseLighting]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feDisplacementMap(props: MenuLinkProps[feDisplacementMap]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feDistantLight(props: MenuLinkProps[feDistantLight]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feDropShadow(props: MenuLinkProps[feDropShadow]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feFlood(props: MenuLinkProps[feFlood]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feFuncA(props: MenuLinkProps[feFuncA]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feFuncB(props: MenuLinkProps[feFuncB]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feFuncG(props: MenuLinkProps[feFuncG]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feFuncR(props: MenuLinkProps[feFuncR]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feGaussianBlur(props: MenuLinkProps[feGaussianBlur]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feImage(props: MenuLinkProps[feImage]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feMerge(props: MenuLinkProps[feMerge]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feMergeNode(props: MenuLinkProps[feMergeNode]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feMorphology(props: MenuLinkProps[feMorphology]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feOffset(props: MenuLinkProps[feOffset]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_fePointLight(props: MenuLinkProps[fePointLight]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feSpecularLighting(props: MenuLinkProps[feSpecularLighting]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feSpotLight(props: MenuLinkProps[feSpotLight]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feTile(props: MenuLinkProps[feTile]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_feTurbulence(props: MenuLinkProps[feTurbulence]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_fieldset(props: MenuLinkProps[fieldset]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_figcaption(props: MenuLinkProps[figcaption]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_figure(props: MenuLinkProps[figure]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_filter(props: MenuLinkProps[filter]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_footer(props: MenuLinkProps[footer]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_foreignObject(props: MenuLinkProps[foreignObject]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_form(props: MenuLinkProps[form]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_g(props: MenuLinkProps[g]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_h1(props: MenuLinkProps[h1]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_h2(props: MenuLinkProps[h2]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_h3(props: MenuLinkProps[h3]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_h4(props: MenuLinkProps[h4]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_h5(props: MenuLinkProps[h5]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_h6(props: MenuLinkProps[h6]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_head(props: MenuLinkProps[head]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_header(props: MenuLinkProps[header]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_hgroup(props: MenuLinkProps[hgroup]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_hr(props: MenuLinkProps[hr]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_html(props: MenuLinkProps[html]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_i(props: MenuLinkProps[i]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_iframe(props: MenuLinkProps[iframe]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_image(props: MenuLinkProps[image]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_img(props: MenuLinkProps[img]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_input(props: MenuLinkProps[input]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_ins(props: MenuLinkProps[ins]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_kbd(props: MenuLinkProps[kbd]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_keygen(props: MenuLinkProps[keygen]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_label(props: MenuLinkProps[label]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_legend(props: MenuLinkProps[legend]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_li(props: MenuLinkProps[li]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_line(props: MenuLinkProps[line]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_linearGradient(props: MenuLinkProps[linearGradient]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_link(props: MenuLinkProps[link]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_main(props: MenuLinkProps[main]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_map(props: MenuLinkProps[map]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_mark(props: MenuLinkProps[mark]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_marker(props: MenuLinkProps[marker]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_mask(props: MenuLinkProps[mask]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_menu(props: MenuLinkProps[menu]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_menuitem(props: MenuLinkProps[menuitem]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_meta(props: MenuLinkProps[meta]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_metadata(props: MenuLinkProps[metadata]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_meter(props: MenuLinkProps[meter]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_mpath(props: MenuLinkProps[mpath]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_nav(props: MenuLinkProps[nav]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_noindex(props: MenuLinkProps[noindex]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_noscript(props: MenuLinkProps[noscript]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_object(props: MenuLinkProps[`object`]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_ol(props: MenuLinkProps[ol]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_optgroup(props: MenuLinkProps[optgroup]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_option(props: MenuLinkProps[option]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_output(props: MenuLinkProps[output]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_p(props: MenuLinkProps[p]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_param(props: MenuLinkProps[param]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_path(props: MenuLinkProps[path]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_pattern(props: MenuLinkProps[pattern]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_picture(props: MenuLinkProps[picture]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_polygon(props: MenuLinkProps[polygon]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_polyline(props: MenuLinkProps[polyline]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_pre(props: MenuLinkProps[pre]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_progress(props: MenuLinkProps[progress]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_q(props: MenuLinkProps[q]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_radialGradient(props: MenuLinkProps[radialGradient]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_rect(props: MenuLinkProps[rect]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_rp(props: MenuLinkProps[rp]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_rt(props: MenuLinkProps[rt]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_ruby(props: MenuLinkProps[ruby]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_s(props: MenuLinkProps[s]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_samp(props: MenuLinkProps[samp]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_script(props: MenuLinkProps[script]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_section(props: MenuLinkProps[section]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_select(props: MenuLinkProps[select]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_slot(props: MenuLinkProps[slot]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_small(props: MenuLinkProps[small]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_source(props: MenuLinkProps[source]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_span(props: MenuLinkProps[span]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_stop(props: MenuLinkProps[stop]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_strong(props: MenuLinkProps[strong]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_style(props: MenuLinkProps[style]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_sub(props: MenuLinkProps[sub]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_summary(props: MenuLinkProps[summary]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_sup(props: MenuLinkProps[sup]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_svg(props: MenuLinkProps[svg]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_switch(props: MenuLinkProps[switch]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_symbol(props: MenuLinkProps[symbol]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_table(props: MenuLinkProps[table]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_tbody(props: MenuLinkProps[tbody]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_td(props: MenuLinkProps[td]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_template(props: MenuLinkProps[template]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_text(props: MenuLinkProps[text]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_textPath(props: MenuLinkProps[textPath]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_textarea(props: MenuLinkProps[textarea]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_tfoot(props: MenuLinkProps[tfoot]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_th(props: MenuLinkProps[th]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_thead(props: MenuLinkProps[thead]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_time(props: MenuLinkProps[time]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_title(props: MenuLinkProps[title]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_tr(props: MenuLinkProps[tr]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_track(props: MenuLinkProps[track]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_tspan(props: MenuLinkProps[tspan]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_u(props: MenuLinkProps[u]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_ul(props: MenuLinkProps[ul]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_use(props: MenuLinkProps[use]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_var(props: MenuLinkProps[`var`]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_video(props: MenuLinkProps[video]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_view(props: MenuLinkProps[view]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_wbr(props: MenuLinkProps[wbr]): ReactElement = js.native
  @JSImport("@reach/menu-button", "MenuLink")
  @js.native
  def MenuLink_webview(props: MenuLinkProps[webview]): ReactElement = js.native
  
  @JSImport("@reach/menu-button", "MenuList")
  @js.native
  val MenuList: ReactComponentClass[MenuListProps] = js.native
  
  @js.native
  trait ButtonRect extends StObject {
    
    var height: Double = js.native
    
    var left: Double = js.native
    
    var top: Double = js.native
    
    var width: Double = js.native
  }
  object ButtonRect {
    
    @scala.inline
    def apply(height: Double, left: Double, top: Double, width: Double): ButtonRect = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonRect]
    }
    
    @scala.inline
    implicit class ButtonRectMutableBuilder[Self <: ButtonRect] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined {  onClick :(e : react.react.MouseEvent<std.HTMLElement, react.react.NativeMouseEvent>): void | undefined,   onKeyDown :(e : react.react.KeyboardEvent<std.HTMLElement>): void | undefined,   children :react.react.ReactNode | undefined} & react.react.HTMLProps<std.HTMLButtonElement> */
  @js.native
  trait MenuButtonProps extends StObject {
    
    var default: js.UndefOr[Boolean] = js.native
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.native
    
    // Standard HTML Attributes
    var accept: js.UndefOr[String] = js.native
    
    var acceptCharset: js.UndefOr[String] = js.native
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.native
    
    var action: js.UndefOr[String] = js.native
    
    var allowFullScreen: js.UndefOr[Boolean] = js.native
    
    var allowTransparency: js.UndefOr[Boolean] = js.native
    
    var alt: js.UndefOr[String] = js.native
    
    /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
    var `aria-atomic`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
      * presented if they are made.
      */
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
    var `aria-busy`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
      * @see aria-pressed @see aria-selected.
      */
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    /**
      * Defines the total number of columns in a table, grid, or treegrid.
      * @see aria-colindex.
      */
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    /**
      * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
      * @see aria-colcount @see aria-colspan.
      */
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    /**
      * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
      * @see aria-colindex @see aria-rowspan.
      */
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    /**
      * Identifies the element (or elements) whose contents or presence are controlled by the current element.
      * @see aria-owns.
      */
    var `aria-controls`: js.UndefOr[String] = js.native
    
    /** Indicates the element that represents the current item within a container or set of related elements. */
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    /**
      * Identifies the element (or elements) that describes the object.
      * @see aria-labelledby
      */
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    /**
      * Identifies the element that provides a detailed, extended description for the object.
      * @see aria-describedby.
      */
    var `aria-details`: js.UndefOr[String] = js.native
    
    /**
      * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
      * @see aria-hidden @see aria-readonly.
      */
    var `aria-disabled`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates what functions can be performed when a dragged object is released on the drop target.
      * @deprecated in ARIA 1.1
      */
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    /**
      * Identifies the element that provides an error message for the object.
      * @see aria-invalid @see aria-describedby.
      */
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
    var `aria-expanded`: js.UndefOr[Boolean] = js.native
    
    /**
      * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
      * allows assistive technology to override the general default of reading in document source order.
      */
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    /**
      * Indicates an element's "grabbed" state in a drag-and-drop operation.
      * @deprecated in ARIA 1.1
      */
    var `aria-grabbed`: js.UndefOr[Boolean] = js.native
    
    /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    /**
      * Indicates whether the element is exposed to an accessibility API.
      * @see aria-disabled.
      */
    var `aria-hidden`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates the entered value does not conform to the format expected by the application.
      * @see aria-errormessage.
      */
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    /**
      * Defines a string value that labels the current element.
      * @see aria-labelledby.
      */
    var `aria-label`: js.UndefOr[String] = js.native
    
    /**
      * Identifies the element (or elements) that labels the current element.
      * @see aria-describedby.
      */
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    /** Defines the hierarchical level of an element within a structure. */
    var `aria-level`: js.UndefOr[Double] = js.native
    
    /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    /** Indicates whether an element is modal when displayed. */
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    /** Indicates whether a text box accepts multiple lines of input or only a single line. */
    var `aria-multiline`: js.UndefOr[Boolean] = js.native
    
    /** Indicates that the user may select more than one item from the current selectable descendants. */
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
    
    /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
      * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
      * @see aria-controls.
      */
    var `aria-owns`: js.UndefOr[String] = js.native
    
    /**
      * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
      * A hint could be a sample value or a brief description of the expected format.
      */
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    /**
      * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
      * @see aria-setsize.
      */
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    /**
      * Indicates the current "pressed" state of toggle buttons.
      * @see aria-checked @see aria-selected.
      */
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    /**
      * Indicates that the element is not editable, but is otherwise operable.
      * @see aria-disabled.
      */
    var `aria-readonly`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
      * @see aria-atomic.
      */
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    /** Indicates that user input is required on the element before a form may be submitted. */
    var `aria-required`: js.UndefOr[Boolean] = js.native
    
    /** Defines a human-readable, author-localized description for the role of an element. */
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    /**
      * Defines the total number of rows in a table, grid, or treegrid.
      * @see aria-rowindex.
      */
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    /**
      * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
      * @see aria-rowcount @see aria-rowspan.
      */
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    /**
      * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
      * @see aria-rowindex @see aria-colspan.
      */
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    /**
      * Indicates the current "selected" state of various widgets.
      * @see aria-checked @see aria-pressed.
      */
    var `aria-selected`: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
      * @see aria-posinset.
      */
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    /** Indicates if items in a table or grid are sorted in ascending or descending order. */
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    /** Defines the maximum allowed value for a range widget. */
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    /** Defines the minimum allowed value for a range widget. */
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    /**
      * Defines the current value for a range widget.
      * @see aria-valuetext.
      */
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    /** Defines the human readable text alternative of aria-valuenow for a range widget. */
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var as: js.UndefOr[String] = js.native
    
    var async: js.UndefOr[Boolean] = js.native
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autoPlay: js.UndefOr[Boolean] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var capture: js.UndefOr[Boolean | String] = js.native
    
    var cellPadding: js.UndefOr[Double | String] = js.native
    
    var cellSpacing: js.UndefOr[Double | String] = js.native
    
    var challenge: js.UndefOr[String] = js.native
    
    var charSet: js.UndefOr[String] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var cite: js.UndefOr[String] = js.native
    
    var classID: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var controls: js.UndefOr[Boolean] = js.native
    
    var coords: js.UndefOr[String] = js.native
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var data: js.UndefOr[String] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    var dateTime: js.UndefOr[String] = js.native
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var defer: js.UndefOr[Boolean] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var download: js.UndefOr[js.Any] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var encType: js.UndefOr[String] = js.native
    
    var form: js.UndefOr[String] = js.native
    
    var formAction: js.UndefOr[String] = js.native
    
    var formEncType: js.UndefOr[String] = js.native
    
    var formMethod: js.UndefOr[String] = js.native
    
    var formNoValidate: js.UndefOr[Boolean] = js.native
    
    var formTarget: js.UndefOr[String] = js.native
    
    var frameBorder: js.UndefOr[Double | String] = js.native
    
    var headers: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var high: js.UndefOr[Double] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var hrefLang: js.UndefOr[String] = js.native
    
    var htmlFor: js.UndefOr[String] = js.native
    
    var httpEquiv: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var inlist: js.UndefOr[js.Any] = js.native
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    var integrity: js.UndefOr[String] = js.native
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key | Null] = js.native
    
    var keyParams: js.UndefOr[String] = js.native
    
    var keyType: js.UndefOr[String] = js.native
    
    var kind: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var list: js.UndefOr[String] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var low: js.UndefOr[Double] = js.native
    
    var manifest: js.UndefOr[String] = js.native
    
    var marginHeight: js.UndefOr[Double] = js.native
    
    var marginWidth: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[Double | String] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var media: js.UndefOr[String] = js.native
    
    var mediaGroup: js.UndefOr[String] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var min: js.UndefOr[Double | String] = js.native
    
    var minLength: js.UndefOr[Double] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var muted: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var noValidate: js.UndefOr[Boolean] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    // Media Events
    var onAbort: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
    
    // Animation Events
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLButtonElement]] = js.native
    
    // MouseEvents
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    // Form Events
    var onChange: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
    
    var onClick: (js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]]) with js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    // Composition Events
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLButtonElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    // Clipboard Events
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLButtonElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    // Focus Events
    var onFocus: js.UndefOr[FocusEventHandler[HTMLButtonElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
    
    // also a Media Event
    // Keyboard Events
    var onKeyDown: (js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLElement], Unit]]) with js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLButtonElement]] = js.native
    
    // Image Events
    var onLoad: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseMove: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLButtonElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLButtonElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    // Pointer Events
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLButtonElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
    
    // UI Events
    var onScroll: js.UndefOr[UIEventHandler[HTMLButtonElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    // Selection Events
    var onSelect: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLButtonElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    // Touch Events
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLButtonElement]] = js.native
    
    // Transition Events
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLButtonElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLButtonElement]] = js.native
    
    // Wheel Events
    var onWheel: js.UndefOr[WheelEventHandler[HTMLButtonElement]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var optimum: js.UndefOr[Double] = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var playsInline: js.UndefOr[Boolean] = js.native
    
    var poster: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var preload: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var ref: js.UndefOr[LegacyRef[HTMLButtonElement]] = js.native
    
    var rel: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var reversed: js.UndefOr[Boolean] = js.native
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[String] = js.native
    
    var rowSpan: js.UndefOr[Double] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var sandbox: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var scoped: js.UndefOr[Boolean] = js.native
    
    var scrolling: js.UndefOr[String] = js.native
    
    var seamless: js.UndefOr[Boolean] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var shape: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var sizes: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var span: js.UndefOr[Double] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var srcDoc: js.UndefOr[String] = js.native
    
    var srcLang: js.UndefOr[String] = js.native
    
    var srcSet: js.UndefOr[String] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var step: js.UndefOr[Double | String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var summary: js.UndefOr[String] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var useMap: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.native
    
    var vocab: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var wmode: js.UndefOr[String] = js.native
    
    var wrap: js.UndefOr[String] = js.native
  }
  object MenuButtonProps {
    
    @scala.inline
    def apply(
      onClick: (js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]]) with js.UndefOr[MouseEventHandler[HTMLButtonElement]],
      onKeyDown: (js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLElement], Unit]]) with js.UndefOr[KeyboardEventHandler[HTMLButtonElement]]
    ): MenuButtonProps = {
      val __obj = js.Dynamic.literal(onClick = onClick.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuButtonProps]
    }
    
    @scala.inline
    implicit class MenuButtonPropsMutableBuilder[Self <: MenuButtonProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      @scala.inline
      def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      @scala.inline
      def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      @scala.inline
      def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
      
      @scala.inline
      def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      @scala.inline
      def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      @scala.inline
      def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      @scala.inline
      def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      @scala.inline
      def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      @scala.inline
      def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      @scala.inline
      def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
      
      @scala.inline
      def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      @scala.inline
      def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      @scala.inline
      def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
      
      @scala.inline
      def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
      
      @scala.inline
      def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]]) with js.UndefOr[MouseEventHandler[HTMLButtonElement]]
      ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: SyntheticClipboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: SyntheticClipboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(
        value: (js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLElement], Unit]]) with js.UndefOr[KeyboardEventHandler[HTMLButtonElement]]
      ): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseMoveUndefined: Self = StObject.set(x, "onMouseMove", js.undefined)
      
      @scala.inline
      def setOnMouseOut(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: SyntheticPointerEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onSelect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectUndefined: Self = StObject.set(x, "onSelect", js.undefined)
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLButtonElement, Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticTouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[Event, HTMLButtonElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: SyntheticWheelEvent[HTMLButtonElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
      
      @scala.inline
      def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRef(value: LegacyRef[HTMLButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLButtonElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[HTMLButtonElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      @scala.inline
      def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      @scala.inline
      def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
      
      @scala.inline
      def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
      
      @scala.inline
      def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
    }
  }
  
  /* Inlined {  onSelect :(): void | undefined,   onClick :(e : react.react.MouseEvent<std.HTMLElement, react.react.NativeMouseEvent>): void | undefined,   onKeyDown :(e : react.react.KeyboardEvent<std.HTMLElement>): void | undefined,   onMouseMove :(e : react.react.MouseEvent<std.HTMLElement, react.react.NativeMouseEvent>): void | undefined,   role :string | undefined,   state :@reach/menu-button.@reach/menu-button.State | undefined,   setState :(s : @reach/menu-button.@reach/menu-button.State): std.Partial<@reach/menu-button.@reach/menu-button.State> | undefined,   index :number | undefined,   _ref :(node : std.HTMLElement): void | undefined} & react.react.HTMLProps<std.HTMLDivElement> */
  @js.native
  trait MenuItemProps extends StObject {
    
    var default: js.UndefOr[Boolean] = js.native
    
    var _ref: js.UndefOr[js.Function1[/* node */ HTMLElement, Unit]] = js.native
    
    // RDFa Attributes
    var about: js.UndefOr[String] = js.native
    
    // Standard HTML Attributes
    var accept: js.UndefOr[String] = js.native
    
    var acceptCharset: js.UndefOr[String] = js.native
    
    // Standard HTML Attributes
    var accessKey: js.UndefOr[String] = js.native
    
    var action: js.UndefOr[String] = js.native
    
    var allowFullScreen: js.UndefOr[Boolean] = js.native
    
    var allowTransparency: js.UndefOr[Boolean] = js.native
    
    var alt: js.UndefOr[String] = js.native
    
    /** Identifies the currently active element when DOM focus is on a composite widget, textbox, group, or application. */
    var `aria-activedescendant`: js.UndefOr[String] = js.native
    
    /** Indicates whether assistive technologies will present all, or only parts of, the changed region based on the change notifications defined by the aria-relevant attribute. */
    var `aria-atomic`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates whether inputting text could trigger display of one or more predictions of the user's intended value for an input and specifies how predictions would be
      * presented if they are made.
      */
    var `aria-autocomplete`: js.UndefOr[none | `inline` | list | both] = js.native
    
    /** Indicates an element is being modified and that assistive technologies MAY want to wait until the modifications are complete before exposing them to the user. */
    var `aria-busy`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates the current "checked" state of checkboxes, radio buttons, and other widgets.
      * @see aria-pressed @see aria-selected.
      */
    var `aria-checked`: js.UndefOr[Boolean | mixed] = js.native
    
    /**
      * Defines the total number of columns in a table, grid, or treegrid.
      * @see aria-colindex.
      */
    var `aria-colcount`: js.UndefOr[Double] = js.native
    
    /**
      * Defines an element's column index or position with respect to the total number of columns within a table, grid, or treegrid.
      * @see aria-colcount @see aria-colspan.
      */
    var `aria-colindex`: js.UndefOr[Double] = js.native
    
    /**
      * Defines the number of columns spanned by a cell or gridcell within a table, grid, or treegrid.
      * @see aria-colindex @see aria-rowspan.
      */
    var `aria-colspan`: js.UndefOr[Double] = js.native
    
    /**
      * Identifies the element (or elements) whose contents or presence are controlled by the current element.
      * @see aria-owns.
      */
    var `aria-controls`: js.UndefOr[String] = js.native
    
    /** Indicates the element that represents the current item within a container or set of related elements. */
    var `aria-current`: js.UndefOr[Boolean | page | step | location | date | time] = js.native
    
    /**
      * Identifies the element (or elements) that describes the object.
      * @see aria-labelledby
      */
    var `aria-describedby`: js.UndefOr[String] = js.native
    
    /**
      * Identifies the element that provides a detailed, extended description for the object.
      * @see aria-describedby.
      */
    var `aria-details`: js.UndefOr[String] = js.native
    
    /**
      * Indicates that the element is perceivable but disabled, so it is not editable or otherwise operable.
      * @see aria-hidden @see aria-readonly.
      */
    var `aria-disabled`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates what functions can be performed when a dragged object is released on the drop target.
      * @deprecated in ARIA 1.1
      */
    var `aria-dropeffect`: js.UndefOr[none | copy | execute | link | move | popup] = js.native
    
    /**
      * Identifies the element that provides an error message for the object.
      * @see aria-invalid @see aria-describedby.
      */
    var `aria-errormessage`: js.UndefOr[String] = js.native
    
    /** Indicates whether the element, or another grouping element it controls, is currently expanded or collapsed. */
    var `aria-expanded`: js.UndefOr[Boolean] = js.native
    
    /**
      * Identifies the next element (or elements) in an alternate reading order of content which, at the user's discretion,
      * allows assistive technology to override the general default of reading in document source order.
      */
    var `aria-flowto`: js.UndefOr[String] = js.native
    
    /**
      * Indicates an element's "grabbed" state in a drag-and-drop operation.
      * @deprecated in ARIA 1.1
      */
    var `aria-grabbed`: js.UndefOr[Boolean] = js.native
    
    /** Indicates the availability and type of interactive popup element, such as menu or dialog, that can be triggered by an element. */
    var `aria-haspopup`: js.UndefOr[Boolean | menu | listbox | tree | grid | dialog] = js.native
    
    /**
      * Indicates whether the element is exposed to an accessibility API.
      * @see aria-disabled.
      */
    var `aria-hidden`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates the entered value does not conform to the format expected by the application.
      * @see aria-errormessage.
      */
    var `aria-invalid`: js.UndefOr[Boolean | grammar | spelling] = js.native
    
    /** Indicates keyboard shortcuts that an author has implemented to activate or give focus to an element. */
    var `aria-keyshortcuts`: js.UndefOr[String] = js.native
    
    /**
      * Defines a string value that labels the current element.
      * @see aria-labelledby.
      */
    var `aria-label`: js.UndefOr[String] = js.native
    
    /**
      * Identifies the element (or elements) that labels the current element.
      * @see aria-describedby.
      */
    var `aria-labelledby`: js.UndefOr[String] = js.native
    
    /** Defines the hierarchical level of an element within a structure. */
    var `aria-level`: js.UndefOr[Double] = js.native
    
    /** Indicates that an element will be updated, and describes the types of updates the user agents, assistive technologies, and user can expect from the live region. */
    var `aria-live`: js.UndefOr[off | assertive | polite] = js.native
    
    /** Indicates whether an element is modal when displayed. */
    var `aria-modal`: js.UndefOr[Boolean] = js.native
    
    /** Indicates whether a text box accepts multiple lines of input or only a single line. */
    var `aria-multiline`: js.UndefOr[Boolean] = js.native
    
    /** Indicates that the user may select more than one item from the current selectable descendants. */
    var `aria-multiselectable`: js.UndefOr[Boolean] = js.native
    
    /** Indicates whether the element's orientation is horizontal, vertical, or unknown/ambiguous. */
    var `aria-orientation`: js.UndefOr[horizontal | vertical] = js.native
    
    /**
      * Identifies an element (or elements) in order to define a visual, functional, or contextual parent/child relationship
      * between DOM elements where the DOM hierarchy cannot be used to represent the relationship.
      * @see aria-controls.
      */
    var `aria-owns`: js.UndefOr[String] = js.native
    
    /**
      * Defines a short hint (a word or short phrase) intended to aid the user with data entry when the control has no value.
      * A hint could be a sample value or a brief description of the expected format.
      */
    var `aria-placeholder`: js.UndefOr[String] = js.native
    
    /**
      * Defines an element's number or position in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
      * @see aria-setsize.
      */
    var `aria-posinset`: js.UndefOr[Double] = js.native
    
    /**
      * Indicates the current "pressed" state of toggle buttons.
      * @see aria-checked @see aria-selected.
      */
    var `aria-pressed`: js.UndefOr[Boolean | mixed] = js.native
    
    /**
      * Indicates that the element is not editable, but is otherwise operable.
      * @see aria-disabled.
      */
    var `aria-readonly`: js.UndefOr[Boolean] = js.native
    
    /**
      * Indicates what notifications the user agent will trigger when the accessibility tree within a live region is modified.
      * @see aria-atomic.
      */
    var `aria-relevant`: js.UndefOr[
        additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ] = js.native
    
    /** Indicates that user input is required on the element before a form may be submitted. */
    var `aria-required`: js.UndefOr[Boolean] = js.native
    
    /** Defines a human-readable, author-localized description for the role of an element. */
    var `aria-roledescription`: js.UndefOr[String] = js.native
    
    /**
      * Defines the total number of rows in a table, grid, or treegrid.
      * @see aria-rowindex.
      */
    var `aria-rowcount`: js.UndefOr[Double] = js.native
    
    /**
      * Defines an element's row index or position with respect to the total number of rows within a table, grid, or treegrid.
      * @see aria-rowcount @see aria-rowspan.
      */
    var `aria-rowindex`: js.UndefOr[Double] = js.native
    
    /**
      * Defines the number of rows spanned by a cell or gridcell within a table, grid, or treegrid.
      * @see aria-rowindex @see aria-colspan.
      */
    var `aria-rowspan`: js.UndefOr[Double] = js.native
    
    /**
      * Indicates the current "selected" state of various widgets.
      * @see aria-checked @see aria-pressed.
      */
    var `aria-selected`: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines the number of items in the current set of listitems or treeitems. Not required if all elements in the set are present in the DOM.
      * @see aria-posinset.
      */
    var `aria-setsize`: js.UndefOr[Double] = js.native
    
    /** Indicates if items in a table or grid are sorted in ascending or descending order. */
    var `aria-sort`: js.UndefOr[none | ascending | descending | other] = js.native
    
    /** Defines the maximum allowed value for a range widget. */
    var `aria-valuemax`: js.UndefOr[Double] = js.native
    
    /** Defines the minimum allowed value for a range widget. */
    var `aria-valuemin`: js.UndefOr[Double] = js.native
    
    /**
      * Defines the current value for a range widget.
      * @see aria-valuetext.
      */
    var `aria-valuenow`: js.UndefOr[Double] = js.native
    
    /** Defines the human readable text alternative of aria-valuenow for a range widget. */
    var `aria-valuetext`: js.UndefOr[String] = js.native
    
    var as: js.UndefOr[String] = js.native
    
    var async: js.UndefOr[Boolean] = js.native
    
    // Non-standard Attributes
    var autoCapitalize: js.UndefOr[String] = js.native
    
    var autoComplete: js.UndefOr[String] = js.native
    
    var autoCorrect: js.UndefOr[String] = js.native
    
    var autoFocus: js.UndefOr[Boolean] = js.native
    
    var autoPlay: js.UndefOr[Boolean] = js.native
    
    var autoSave: js.UndefOr[String] = js.native
    
    var capture: js.UndefOr[Boolean | String] = js.native
    
    var cellPadding: js.UndefOr[Double | String] = js.native
    
    var cellSpacing: js.UndefOr[Double | String] = js.native
    
    var challenge: js.UndefOr[String] = js.native
    
    var charSet: js.UndefOr[String] = js.native
    
    var checked: js.UndefOr[Boolean] = js.native
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var cite: js.UndefOr[String] = js.native
    
    var classID: js.UndefOr[String] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var colSpan: js.UndefOr[Double] = js.native
    
    var color: js.UndefOr[String] = js.native
    
    var cols: js.UndefOr[Double] = js.native
    
    var content: js.UndefOr[String] = js.native
    
    var contentEditable: js.UndefOr[Booleanish | inherit] = js.native
    
    var contextMenu: js.UndefOr[String] = js.native
    
    var controls: js.UndefOr[Boolean] = js.native
    
    var coords: js.UndefOr[String] = js.native
    
    var crossOrigin: js.UndefOr[String] = js.native
    
    var dangerouslySetInnerHTML: js.UndefOr[Html] = js.native
    
    var data: js.UndefOr[String] = js.native
    
    var datatype: js.UndefOr[String] = js.native
    
    var dateTime: js.UndefOr[String] = js.native
    
    // React-specific Attributes
    var defaultChecked: js.UndefOr[Boolean] = js.native
    
    var defaultValue: js.UndefOr[String | Double | js.Array[String]] = js.native
    
    var defer: js.UndefOr[Boolean] = js.native
    
    var dir: js.UndefOr[String] = js.native
    
    var disabled: js.UndefOr[Boolean] = js.native
    
    var download: js.UndefOr[js.Any] = js.native
    
    var draggable: js.UndefOr[Booleanish] = js.native
    
    var encType: js.UndefOr[String] = js.native
    
    var form: js.UndefOr[String] = js.native
    
    var formAction: js.UndefOr[String] = js.native
    
    var formEncType: js.UndefOr[String] = js.native
    
    var formMethod: js.UndefOr[String] = js.native
    
    var formNoValidate: js.UndefOr[Boolean] = js.native
    
    var formTarget: js.UndefOr[String] = js.native
    
    var frameBorder: js.UndefOr[Double | String] = js.native
    
    var headers: js.UndefOr[String] = js.native
    
    var height: js.UndefOr[Double | String] = js.native
    
    var hidden: js.UndefOr[Boolean] = js.native
    
    var high: js.UndefOr[Double] = js.native
    
    var href: js.UndefOr[String] = js.native
    
    var hrefLang: js.UndefOr[String] = js.native
    
    var htmlFor: js.UndefOr[String] = js.native
    
    var httpEquiv: js.UndefOr[String] = js.native
    
    var id: js.UndefOr[String] = js.native
    
    var index: js.UndefOr[Double] = js.native
    
    var inlist: js.UndefOr[js.Any] = js.native
    
    // Living Standard
    /**
      * Hints at the type of data that might be entered by the user while editing the element or its contents
      * @see https://html.spec.whatwg.org/multipage/interaction.html#input-modalities:-the-inputmode-attribute
      */
    var inputMode: js.UndefOr[none | text | tel | url | email | numeric | decimal | search] = js.native
    
    var integrity: js.UndefOr[String] = js.native
    
    /**
      * Specify that a standard HTML element should behave like a defined custom built-in element
      * @see https://html.spec.whatwg.org/multipage/custom-elements.html#attr-is
      */
    var is: js.UndefOr[String] = js.native
    
    var itemID: js.UndefOr[String] = js.native
    
    var itemProp: js.UndefOr[String] = js.native
    
    var itemRef: js.UndefOr[String] = js.native
    
    var itemScope: js.UndefOr[Boolean] = js.native
    
    var itemType: js.UndefOr[String] = js.native
    
    var key: js.UndefOr[Key | Null] = js.native
    
    var keyParams: js.UndefOr[String] = js.native
    
    var keyType: js.UndefOr[String] = js.native
    
    var kind: js.UndefOr[String] = js.native
    
    var label: js.UndefOr[String] = js.native
    
    var lang: js.UndefOr[String] = js.native
    
    var list: js.UndefOr[String] = js.native
    
    var loop: js.UndefOr[Boolean] = js.native
    
    var low: js.UndefOr[Double] = js.native
    
    var manifest: js.UndefOr[String] = js.native
    
    var marginHeight: js.UndefOr[Double] = js.native
    
    var marginWidth: js.UndefOr[Double] = js.native
    
    var max: js.UndefOr[Double | String] = js.native
    
    var maxLength: js.UndefOr[Double] = js.native
    
    var media: js.UndefOr[String] = js.native
    
    var mediaGroup: js.UndefOr[String] = js.native
    
    var method: js.UndefOr[String] = js.native
    
    var min: js.UndefOr[Double | String] = js.native
    
    var minLength: js.UndefOr[Double] = js.native
    
    var multiple: js.UndefOr[Boolean] = js.native
    
    var muted: js.UndefOr[Boolean] = js.native
    
    var name: js.UndefOr[String] = js.native
    
    var noValidate: js.UndefOr[Boolean] = js.native
    
    var nonce: js.UndefOr[String] = js.native
    
    // Media Events
    var onAbort: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onAnimationEnd: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
    
    var onAnimationIteration: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
    
    // Animation Events
    var onAnimationStart: js.UndefOr[AnimationEventHandler[HTMLDivElement]] = js.native
    
    // MouseEvents
    var onAuxClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onBeforeInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onBlur: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onCanPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onCanPlayThrough: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    // Form Events
    var onChange: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onClick: (js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]]) with js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    // Composition Events
    var onCompositionEnd: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    var onCompositionStart: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    var onCompositionUpdate: js.UndefOr[CompositionEventHandler[HTMLDivElement]] = js.native
    
    var onContextMenu: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    // Clipboard Events
    var onCopy: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    var onCut: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    var onDoubleClick: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onDrag: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragEnd: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragEnter: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragExit: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragLeave: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragOver: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDragStart: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDrop: js.UndefOr[DragEventHandler[HTMLDivElement]] = js.native
    
    var onDurationChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onEmptied: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onEncrypted: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onEnded: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onError: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    // Focus Events
    var onFocus: js.UndefOr[FocusEventHandler[HTMLDivElement]] = js.native
    
    var onInput: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onInvalid: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    // also a Media Event
    // Keyboard Events
    var onKeyDown: (js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLElement], Unit]]) with js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onKeyPress: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    var onKeyUp: js.UndefOr[KeyboardEventHandler[HTMLDivElement]] = js.native
    
    // Image Events
    var onLoad: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onLoadStart: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onLoadedData: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onLoadedMetadata: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onMouseDown: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseEnter: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseLeave: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseMove: (js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]]) with js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseOut: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseOver: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onMouseUp: js.UndefOr[MouseEventHandler[HTMLDivElement]] = js.native
    
    var onPaste: js.UndefOr[ClipboardEventHandler[HTMLDivElement]] = js.native
    
    var onPause: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onPlay: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onPlaying: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onPointerCancel: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    // Pointer Events
    var onPointerDown: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerEnter: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerLeave: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerMove: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerOut: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerOver: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onPointerUp: js.UndefOr[PointerEventHandler[HTMLDivElement]] = js.native
    
    var onProgress: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onRateChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onReset: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    // UI Events
    var onScroll: js.UndefOr[UIEventHandler[HTMLDivElement]] = js.native
    
    var onSeeked: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onSeeking: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    // Selection Events
    var onSelect: js.UndefOr[js.Function0[Unit]] with js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onStalled: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onSubmit: js.UndefOr[FormEventHandler[HTMLDivElement]] = js.native
    
    var onSuspend: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onTimeUpdate: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    // Touch Events
    var onTouchCancel: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTouchEnd: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTouchMove: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    var onTouchStart: js.UndefOr[TouchEventHandler[HTMLDivElement]] = js.native
    
    // Transition Events
    var onTransitionEnd: js.UndefOr[TransitionEventHandler[HTMLDivElement]] = js.native
    
    var onVolumeChange: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    var onWaiting: js.UndefOr[ReactEventHandler[HTMLDivElement]] = js.native
    
    // Wheel Events
    var onWheel: js.UndefOr[WheelEventHandler[HTMLDivElement]] = js.native
    
    var open: js.UndefOr[Boolean] = js.native
    
    var optimum: js.UndefOr[Double] = js.native
    
    var pattern: js.UndefOr[String] = js.native
    
    var placeholder: js.UndefOr[String] = js.native
    
    var playsInline: js.UndefOr[Boolean] = js.native
    
    var poster: js.UndefOr[String] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var preload: js.UndefOr[String] = js.native
    
    var property: js.UndefOr[String] = js.native
    
    // Unknown
    var radioGroup: js.UndefOr[String] = js.native
    
    var readOnly: js.UndefOr[Boolean] = js.native
    
    var ref: js.UndefOr[LegacyRef[HTMLDivElement]] = js.native
    
    var rel: js.UndefOr[String] = js.native
    
    var required: js.UndefOr[Boolean] = js.native
    
    var resource: js.UndefOr[String] = js.native
    
    var results: js.UndefOr[Double] = js.native
    
    var reversed: js.UndefOr[Boolean] = js.native
    
    // <command>, <menuitem>
    // WAI-ARIA
    var role: js.UndefOr[String] = js.native
    
    var rowSpan: js.UndefOr[Double] = js.native
    
    var rows: js.UndefOr[Double] = js.native
    
    var sandbox: js.UndefOr[String] = js.native
    
    var scope: js.UndefOr[String] = js.native
    
    var scoped: js.UndefOr[Boolean] = js.native
    
    var scrolling: js.UndefOr[String] = js.native
    
    var seamless: js.UndefOr[Boolean] = js.native
    
    var security: js.UndefOr[String] = js.native
    
    var selected: js.UndefOr[Boolean] = js.native
    
    var setState: js.UndefOr[js.Function1[/* s */ State, PartialState]] = js.native
    
    var shape: js.UndefOr[String] = js.native
    
    var size: js.UndefOr[Double] = js.native
    
    var sizes: js.UndefOr[String] = js.native
    
    var slot: js.UndefOr[String] = js.native
    
    var span: js.UndefOr[Double] = js.native
    
    var spellCheck: js.UndefOr[Booleanish] = js.native
    
    var src: js.UndefOr[String] = js.native
    
    var srcDoc: js.UndefOr[String] = js.native
    
    var srcLang: js.UndefOr[String] = js.native
    
    var srcSet: js.UndefOr[String] = js.native
    
    var start: js.UndefOr[Double] = js.native
    
    var state: js.UndefOr[State] = js.native
    
    var step: js.UndefOr[Double | String] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var summary: js.UndefOr[String] = js.native
    
    var suppressContentEditableWarning: js.UndefOr[Boolean] = js.native
    
    var suppressHydrationWarning: js.UndefOr[Boolean] = js.native
    
    var tabIndex: js.UndefOr[Double] = js.native
    
    var target: js.UndefOr[String] = js.native
    
    var title: js.UndefOr[String] = js.native
    
    var translate: js.UndefOr[yes | no] = js.native
    
    var `type`: js.UndefOr[String] = js.native
    
    var typeof: js.UndefOr[String] = js.native
    
    var unselectable: js.UndefOr[on | off] = js.native
    
    var useMap: js.UndefOr[String] = js.native
    
    var value: js.UndefOr[String | js.Array[String] | Double] = js.native
    
    var vocab: js.UndefOr[String] = js.native
    
    var width: js.UndefOr[Double | String] = js.native
    
    var wmode: js.UndefOr[String] = js.native
    
    var wrap: js.UndefOr[String] = js.native
  }
  object MenuItemProps {
    
    @scala.inline
    def apply(
      onClick: (js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]]) with js.UndefOr[MouseEventHandler[HTMLDivElement]],
      onKeyDown: (js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLElement], Unit]]) with js.UndefOr[KeyboardEventHandler[HTMLDivElement]],
      onMouseMove: (js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]]) with js.UndefOr[MouseEventHandler[HTMLDivElement]],
      onSelect: js.UndefOr[js.Function0[Unit]] with js.UndefOr[ReactEventHandler[HTMLDivElement]]
    ): MenuItemProps = {
      val __obj = js.Dynamic.literal(onClick = onClick.asInstanceOf[js.Any], onKeyDown = onKeyDown.asInstanceOf[js.Any], onMouseMove = onMouseMove.asInstanceOf[js.Any], onSelect = onSelect.asInstanceOf[js.Any])
      __obj.asInstanceOf[MenuItemProps]
    }
    
    @scala.inline
    implicit class MenuItemPropsMutableBuilder[Self <: MenuItemProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAbout(value: String): Self = StObject.set(x, "about", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAboutUndefined: Self = StObject.set(x, "about", js.undefined)
      
      @scala.inline
      def setAccept(value: String): Self = StObject.set(x, "accept", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharset(value: String): Self = StObject.set(x, "acceptCharset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAcceptCharsetUndefined: Self = StObject.set(x, "acceptCharset", js.undefined)
      
      @scala.inline
      def setAcceptUndefined: Self = StObject.set(x, "accept", js.undefined)
      
      @scala.inline
      def setAccessKey(value: String): Self = StObject.set(x, "accessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyUndefined: Self = StObject.set(x, "accessKey", js.undefined)
      
      @scala.inline
      def setAction(value: String): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActionUndefined: Self = StObject.set(x, "action", js.undefined)
      
      @scala.inline
      def setAllowFullScreen(value: Boolean): Self = StObject.set(x, "allowFullScreen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowFullScreenUndefined: Self = StObject.set(x, "allowFullScreen", js.undefined)
      
      @scala.inline
      def setAllowTransparency(value: Boolean): Self = StObject.set(x, "allowTransparency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowTransparencyUndefined: Self = StObject.set(x, "allowTransparency", js.undefined)
      
      @scala.inline
      def setAlt(value: String): Self = StObject.set(x, "alt", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAltUndefined: Self = StObject.set(x, "alt", js.undefined)
      
      @scala.inline
      def `setAria-activedescendant`(value: String): Self = StObject.set(x, "aria-activedescendant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-activedescendantUndefined`: Self = StObject.set(x, "aria-activedescendant", js.undefined)
      
      @scala.inline
      def `setAria-atomic`(value: Boolean): Self = StObject.set(x, "aria-atomic", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-atomicUndefined`: Self = StObject.set(x, "aria-atomic", js.undefined)
      
      @scala.inline
      def `setAria-autocomplete`(value: none | `inline` | list | both): Self = StObject.set(x, "aria-autocomplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-autocompleteUndefined`: Self = StObject.set(x, "aria-autocomplete", js.undefined)
      
      @scala.inline
      def `setAria-busy`(value: Boolean): Self = StObject.set(x, "aria-busy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-busyUndefined`: Self = StObject.set(x, "aria-busy", js.undefined)
      
      @scala.inline
      def `setAria-checked`(value: Boolean | mixed): Self = StObject.set(x, "aria-checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-checkedUndefined`: Self = StObject.set(x, "aria-checked", js.undefined)
      
      @scala.inline
      def `setAria-colcount`(value: Double): Self = StObject.set(x, "aria-colcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colcountUndefined`: Self = StObject.set(x, "aria-colcount", js.undefined)
      
      @scala.inline
      def `setAria-colindex`(value: Double): Self = StObject.set(x, "aria-colindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colindexUndefined`: Self = StObject.set(x, "aria-colindex", js.undefined)
      
      @scala.inline
      def `setAria-colspan`(value: Double): Self = StObject.set(x, "aria-colspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-colspanUndefined`: Self = StObject.set(x, "aria-colspan", js.undefined)
      
      @scala.inline
      def `setAria-controls`(value: String): Self = StObject.set(x, "aria-controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-controlsUndefined`: Self = StObject.set(x, "aria-controls", js.undefined)
      
      @scala.inline
      def `setAria-current`(value: Boolean | page | step | location | date | time): Self = StObject.set(x, "aria-current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-currentUndefined`: Self = StObject.set(x, "aria-current", js.undefined)
      
      @scala.inline
      def `setAria-describedby`(value: String): Self = StObject.set(x, "aria-describedby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-describedbyUndefined`: Self = StObject.set(x, "aria-describedby", js.undefined)
      
      @scala.inline
      def `setAria-details`(value: String): Self = StObject.set(x, "aria-details", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-detailsUndefined`: Self = StObject.set(x, "aria-details", js.undefined)
      
      @scala.inline
      def `setAria-disabled`(value: Boolean): Self = StObject.set(x, "aria-disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-disabledUndefined`: Self = StObject.set(x, "aria-disabled", js.undefined)
      
      @scala.inline
      def `setAria-dropeffect`(value: none | copy | execute | link | move | popup): Self = StObject.set(x, "aria-dropeffect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-dropeffectUndefined`: Self = StObject.set(x, "aria-dropeffect", js.undefined)
      
      @scala.inline
      def `setAria-errormessage`(value: String): Self = StObject.set(x, "aria-errormessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-errormessageUndefined`: Self = StObject.set(x, "aria-errormessage", js.undefined)
      
      @scala.inline
      def `setAria-expanded`(value: Boolean): Self = StObject.set(x, "aria-expanded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-expandedUndefined`: Self = StObject.set(x, "aria-expanded", js.undefined)
      
      @scala.inline
      def `setAria-flowto`(value: String): Self = StObject.set(x, "aria-flowto", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-flowtoUndefined`: Self = StObject.set(x, "aria-flowto", js.undefined)
      
      @scala.inline
      def `setAria-grabbed`(value: Boolean): Self = StObject.set(x, "aria-grabbed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-grabbedUndefined`: Self = StObject.set(x, "aria-grabbed", js.undefined)
      
      @scala.inline
      def `setAria-haspopup`(value: Boolean | menu | listbox | tree | grid | dialog): Self = StObject.set(x, "aria-haspopup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-haspopupUndefined`: Self = StObject.set(x, "aria-haspopup", js.undefined)
      
      @scala.inline
      def `setAria-hidden`(value: Boolean): Self = StObject.set(x, "aria-hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-hiddenUndefined`: Self = StObject.set(x, "aria-hidden", js.undefined)
      
      @scala.inline
      def `setAria-invalid`(value: Boolean | grammar | spelling): Self = StObject.set(x, "aria-invalid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-invalidUndefined`: Self = StObject.set(x, "aria-invalid", js.undefined)
      
      @scala.inline
      def `setAria-keyshortcuts`(value: String): Self = StObject.set(x, "aria-keyshortcuts", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-keyshortcutsUndefined`: Self = StObject.set(x, "aria-keyshortcuts", js.undefined)
      
      @scala.inline
      def `setAria-label`(value: String): Self = StObject.set(x, "aria-label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelUndefined`: Self = StObject.set(x, "aria-label", js.undefined)
      
      @scala.inline
      def `setAria-labelledby`(value: String): Self = StObject.set(x, "aria-labelledby", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-labelledbyUndefined`: Self = StObject.set(x, "aria-labelledby", js.undefined)
      
      @scala.inline
      def `setAria-level`(value: Double): Self = StObject.set(x, "aria-level", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-levelUndefined`: Self = StObject.set(x, "aria-level", js.undefined)
      
      @scala.inline
      def `setAria-live`(value: off | assertive | polite): Self = StObject.set(x, "aria-live", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-liveUndefined`: Self = StObject.set(x, "aria-live", js.undefined)
      
      @scala.inline
      def `setAria-modal`(value: Boolean): Self = StObject.set(x, "aria-modal", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-modalUndefined`: Self = StObject.set(x, "aria-modal", js.undefined)
      
      @scala.inline
      def `setAria-multiline`(value: Boolean): Self = StObject.set(x, "aria-multiline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multilineUndefined`: Self = StObject.set(x, "aria-multiline", js.undefined)
      
      @scala.inline
      def `setAria-multiselectable`(value: Boolean): Self = StObject.set(x, "aria-multiselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-multiselectableUndefined`: Self = StObject.set(x, "aria-multiselectable", js.undefined)
      
      @scala.inline
      def `setAria-orientation`(value: horizontal | vertical): Self = StObject.set(x, "aria-orientation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-orientationUndefined`: Self = StObject.set(x, "aria-orientation", js.undefined)
      
      @scala.inline
      def `setAria-owns`(value: String): Self = StObject.set(x, "aria-owns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-ownsUndefined`: Self = StObject.set(x, "aria-owns", js.undefined)
      
      @scala.inline
      def `setAria-placeholder`(value: String): Self = StObject.set(x, "aria-placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-placeholderUndefined`: Self = StObject.set(x, "aria-placeholder", js.undefined)
      
      @scala.inline
      def `setAria-posinset`(value: Double): Self = StObject.set(x, "aria-posinset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-posinsetUndefined`: Self = StObject.set(x, "aria-posinset", js.undefined)
      
      @scala.inline
      def `setAria-pressed`(value: Boolean | mixed): Self = StObject.set(x, "aria-pressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-pressedUndefined`: Self = StObject.set(x, "aria-pressed", js.undefined)
      
      @scala.inline
      def `setAria-readonly`(value: Boolean): Self = StObject.set(x, "aria-readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-readonlyUndefined`: Self = StObject.set(x, "aria-readonly", js.undefined)
      
      @scala.inline
      def `setAria-relevant`(
        value: additions | (`additions removals`) | (`additions text`) | all | removals | (`removals additions`) | (`removals text`) | text | (`text additions`) | (`text removals`)
      ): Self = StObject.set(x, "aria-relevant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-relevantUndefined`: Self = StObject.set(x, "aria-relevant", js.undefined)
      
      @scala.inline
      def `setAria-required`(value: Boolean): Self = StObject.set(x, "aria-required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-requiredUndefined`: Self = StObject.set(x, "aria-required", js.undefined)
      
      @scala.inline
      def `setAria-roledescription`(value: String): Self = StObject.set(x, "aria-roledescription", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-roledescriptionUndefined`: Self = StObject.set(x, "aria-roledescription", js.undefined)
      
      @scala.inline
      def `setAria-rowcount`(value: Double): Self = StObject.set(x, "aria-rowcount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowcountUndefined`: Self = StObject.set(x, "aria-rowcount", js.undefined)
      
      @scala.inline
      def `setAria-rowindex`(value: Double): Self = StObject.set(x, "aria-rowindex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowindexUndefined`: Self = StObject.set(x, "aria-rowindex", js.undefined)
      
      @scala.inline
      def `setAria-rowspan`(value: Double): Self = StObject.set(x, "aria-rowspan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-rowspanUndefined`: Self = StObject.set(x, "aria-rowspan", js.undefined)
      
      @scala.inline
      def `setAria-selected`(value: Boolean): Self = StObject.set(x, "aria-selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-selectedUndefined`: Self = StObject.set(x, "aria-selected", js.undefined)
      
      @scala.inline
      def `setAria-setsize`(value: Double): Self = StObject.set(x, "aria-setsize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-setsizeUndefined`: Self = StObject.set(x, "aria-setsize", js.undefined)
      
      @scala.inline
      def `setAria-sort`(value: none | ascending | descending | other): Self = StObject.set(x, "aria-sort", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-sortUndefined`: Self = StObject.set(x, "aria-sort", js.undefined)
      
      @scala.inline
      def `setAria-valuemax`(value: Double): Self = StObject.set(x, "aria-valuemax", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuemaxUndefined`: Self = StObject.set(x, "aria-valuemax", js.undefined)
      
      @scala.inline
      def `setAria-valuemin`(value: Double): Self = StObject.set(x, "aria-valuemin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valueminUndefined`: Self = StObject.set(x, "aria-valuemin", js.undefined)
      
      @scala.inline
      def `setAria-valuenow`(value: Double): Self = StObject.set(x, "aria-valuenow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuenowUndefined`: Self = StObject.set(x, "aria-valuenow", js.undefined)
      
      @scala.inline
      def `setAria-valuetext`(value: String): Self = StObject.set(x, "aria-valuetext", value.asInstanceOf[js.Any])
      
      @scala.inline
      def `setAria-valuetextUndefined`: Self = StObject.set(x, "aria-valuetext", js.undefined)
      
      @scala.inline
      def setAs(value: String): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setAutoCapitalize(value: String): Self = StObject.set(x, "autoCapitalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCapitalizeUndefined: Self = StObject.set(x, "autoCapitalize", js.undefined)
      
      @scala.inline
      def setAutoComplete(value: String): Self = StObject.set(x, "autoComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCompleteUndefined: Self = StObject.set(x, "autoComplete", js.undefined)
      
      @scala.inline
      def setAutoCorrect(value: String): Self = StObject.set(x, "autoCorrect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoCorrectUndefined: Self = StObject.set(x, "autoCorrect", js.undefined)
      
      @scala.inline
      def setAutoFocus(value: Boolean): Self = StObject.set(x, "autoFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoFocusUndefined: Self = StObject.set(x, "autoFocus", js.undefined)
      
      @scala.inline
      def setAutoPlay(value: Boolean): Self = StObject.set(x, "autoPlay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoPlayUndefined: Self = StObject.set(x, "autoPlay", js.undefined)
      
      @scala.inline
      def setAutoSave(value: String): Self = StObject.set(x, "autoSave", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoSaveUndefined: Self = StObject.set(x, "autoSave", js.undefined)
      
      @scala.inline
      def setCapture(value: Boolean | String): Self = StObject.set(x, "capture", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaptureUndefined: Self = StObject.set(x, "capture", js.undefined)
      
      @scala.inline
      def setCellPadding(value: Double | String): Self = StObject.set(x, "cellPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellPaddingUndefined: Self = StObject.set(x, "cellPadding", js.undefined)
      
      @scala.inline
      def setCellSpacing(value: Double | String): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      @scala.inline
      def setChallenge(value: String): Self = StObject.set(x, "challenge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChallengeUndefined: Self = StObject.set(x, "challenge", js.undefined)
      
      @scala.inline
      def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
      
      @scala.inline
      def setChecked(value: Boolean): Self = StObject.set(x, "checked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCheckedUndefined: Self = StObject.set(x, "checked", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setCite(value: String): Self = StObject.set(x, "cite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCiteUndefined: Self = StObject.set(x, "cite", js.undefined)
      
      @scala.inline
      def setClassID(value: String): Self = StObject.set(x, "classID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassIDUndefined: Self = StObject.set(x, "classID", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setColSpan(value: Double): Self = StObject.set(x, "colSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColSpanUndefined: Self = StObject.set(x, "colSpan", js.undefined)
      
      @scala.inline
      def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCols(value: Double): Self = StObject.set(x, "cols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColsUndefined: Self = StObject.set(x, "cols", js.undefined)
      
      @scala.inline
      def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditable(value: Booleanish | inherit): Self = StObject.set(x, "contentEditable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContentEditableUndefined: Self = StObject.set(x, "contentEditable", js.undefined)
      
      @scala.inline
      def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      @scala.inline
      def setContextMenu(value: String): Self = StObject.set(x, "contextMenu", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContextMenuUndefined: Self = StObject.set(x, "contextMenu", js.undefined)
      
      @scala.inline
      def setControls(value: Boolean): Self = StObject.set(x, "controls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setControlsUndefined: Self = StObject.set(x, "controls", js.undefined)
      
      @scala.inline
      def setCoords(value: String): Self = StObject.set(x, "coords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCoordsUndefined: Self = StObject.set(x, "coords", js.undefined)
      
      @scala.inline
      def setCrossOrigin(value: String): Self = StObject.set(x, "crossOrigin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCrossOriginUndefined: Self = StObject.set(x, "crossOrigin", js.undefined)
      
      @scala.inline
      def setDangerouslySetInnerHTML(value: Html): Self = StObject.set(x, "dangerouslySetInnerHTML", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDangerouslySetInnerHTMLUndefined: Self = StObject.set(x, "dangerouslySetInnerHTML", js.undefined)
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDatatype(value: String): Self = StObject.set(x, "datatype", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDatatypeUndefined: Self = StObject.set(x, "datatype", js.undefined)
      
      @scala.inline
      def setDateTime(value: String): Self = StObject.set(x, "dateTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDateTimeUndefined: Self = StObject.set(x, "dateTime", js.undefined)
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultChecked(value: Boolean): Self = StObject.set(x, "defaultChecked", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultCheckedUndefined: Self = StObject.set(x, "defaultChecked", js.undefined)
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: String | Double | js.Array[String]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setDefaultValueVarargs(value: String*): Self = StObject.set(x, "defaultValue", js.Array(value :_*))
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setDir(value: String): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirUndefined: Self = StObject.set(x, "dir", js.undefined)
      
      @scala.inline
      def setDisabled(value: Boolean): Self = StObject.set(x, "disabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisabledUndefined: Self = StObject.set(x, "disabled", js.undefined)
      
      @scala.inline
      def setDownload(value: js.Any): Self = StObject.set(x, "download", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDownloadUndefined: Self = StObject.set(x, "download", js.undefined)
      
      @scala.inline
      def setDraggable(value: Booleanish): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEncType(value: String): Self = StObject.set(x, "encType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncTypeUndefined: Self = StObject.set(x, "encType", js.undefined)
      
      @scala.inline
      def setForm(value: String): Self = StObject.set(x, "form", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormAction(value: String): Self = StObject.set(x, "formAction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormActionUndefined: Self = StObject.set(x, "formAction", js.undefined)
      
      @scala.inline
      def setFormEncType(value: String): Self = StObject.set(x, "formEncType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormEncTypeUndefined: Self = StObject.set(x, "formEncType", js.undefined)
      
      @scala.inline
      def setFormMethod(value: String): Self = StObject.set(x, "formMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormMethodUndefined: Self = StObject.set(x, "formMethod", js.undefined)
      
      @scala.inline
      def setFormNoValidate(value: Boolean): Self = StObject.set(x, "formNoValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormNoValidateUndefined: Self = StObject.set(x, "formNoValidate", js.undefined)
      
      @scala.inline
      def setFormTarget(value: String): Self = StObject.set(x, "formTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFormTargetUndefined: Self = StObject.set(x, "formTarget", js.undefined)
      
      @scala.inline
      def setFormUndefined: Self = StObject.set(x, "form", js.undefined)
      
      @scala.inline
      def setFrameBorder(value: Double | String): Self = StObject.set(x, "frameBorder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameBorderUndefined: Self = StObject.set(x, "frameBorder", js.undefined)
      
      @scala.inline
      def setHeaders(value: String): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      @scala.inline
      def setHeight(value: Double | String): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setHidden(value: Boolean): Self = StObject.set(x, "hidden", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHiddenUndefined: Self = StObject.set(x, "hidden", js.undefined)
      
      @scala.inline
      def setHigh(value: Double): Self = StObject.set(x, "high", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighUndefined: Self = StObject.set(x, "high", js.undefined)
      
      @scala.inline
      def setHref(value: String): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLang(value: String): Self = StObject.set(x, "hrefLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefLangUndefined: Self = StObject.set(x, "hrefLang", js.undefined)
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setHtmlFor(value: String): Self = StObject.set(x, "htmlFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHtmlForUndefined: Self = StObject.set(x, "htmlFor", js.undefined)
      
      @scala.inline
      def setHttpEquiv(value: String): Self = StObject.set(x, "httpEquiv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpEquivUndefined: Self = StObject.set(x, "httpEquiv", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setInlist(value: js.Any): Self = StObject.set(x, "inlist", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInlistUndefined: Self = StObject.set(x, "inlist", js.undefined)
      
      @scala.inline
      def setInputMode(value: none | text | tel | url | email | numeric | decimal | search): Self = StObject.set(x, "inputMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputModeUndefined: Self = StObject.set(x, "inputMode", js.undefined)
      
      @scala.inline
      def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      @scala.inline
      def setIs(value: String): Self = StObject.set(x, "is", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsUndefined: Self = StObject.set(x, "is", js.undefined)
      
      @scala.inline
      def setItemID(value: String): Self = StObject.set(x, "itemID", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemIDUndefined: Self = StObject.set(x, "itemID", js.undefined)
      
      @scala.inline
      def setItemProp(value: String): Self = StObject.set(x, "itemProp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemPropUndefined: Self = StObject.set(x, "itemProp", js.undefined)
      
      @scala.inline
      def setItemRef(value: String): Self = StObject.set(x, "itemRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemRefUndefined: Self = StObject.set(x, "itemRef", js.undefined)
      
      @scala.inline
      def setItemScope(value: Boolean): Self = StObject.set(x, "itemScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemScopeUndefined: Self = StObject.set(x, "itemScope", js.undefined)
      
      @scala.inline
      def setItemType(value: String): Self = StObject.set(x, "itemType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemTypeUndefined: Self = StObject.set(x, "itemType", js.undefined)
      
      @scala.inline
      def setKey(value: Key): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyNull: Self = StObject.set(x, "key", null)
      
      @scala.inline
      def setKeyParams(value: String): Self = StObject.set(x, "keyParams", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyParamsUndefined: Self = StObject.set(x, "keyParams", js.undefined)
      
      @scala.inline
      def setKeyType(value: String): Self = StObject.set(x, "keyType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyTypeUndefined: Self = StObject.set(x, "keyType", js.undefined)
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKindUndefined: Self = StObject.set(x, "kind", js.undefined)
      
      @scala.inline
      def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setLang(value: String): Self = StObject.set(x, "lang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLangUndefined: Self = StObject.set(x, "lang", js.undefined)
      
      @scala.inline
      def setList(value: String): Self = StObject.set(x, "list", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setListUndefined: Self = StObject.set(x, "list", js.undefined)
      
      @scala.inline
      def setLoop(value: Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
      
      @scala.inline
      def setLow(value: Double): Self = StObject.set(x, "low", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLowUndefined: Self = StObject.set(x, "low", js.undefined)
      
      @scala.inline
      def setManifest(value: String): Self = StObject.set(x, "manifest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManifestUndefined: Self = StObject.set(x, "manifest", js.undefined)
      
      @scala.inline
      def setMarginHeight(value: Double): Self = StObject.set(x, "marginHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginHeightUndefined: Self = StObject.set(x, "marginHeight", js.undefined)
      
      @scala.inline
      def setMarginWidth(value: Double): Self = StObject.set(x, "marginWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMarginWidthUndefined: Self = StObject.set(x, "marginWidth", js.undefined)
      
      @scala.inline
      def setMax(value: Double | String): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMedia(value: String): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaGroup(value: String): Self = StObject.set(x, "mediaGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMediaGroupUndefined: Self = StObject.set(x, "mediaGroup", js.undefined)
      
      @scala.inline
      def setMediaUndefined: Self = StObject.set(x, "media", js.undefined)
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setMin(value: Double | String): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLength(value: Double): Self = StObject.set(x, "minLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinLengthUndefined: Self = StObject.set(x, "minLength", js.undefined)
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setMultiple(value: Boolean): Self = StObject.set(x, "multiple", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMultipleUndefined: Self = StObject.set(x, "multiple", js.undefined)
      
      @scala.inline
      def setMuted(value: Boolean): Self = StObject.set(x, "muted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMutedUndefined: Self = StObject.set(x, "muted", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNoValidate(value: Boolean): Self = StObject.set(x, "noValidate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoValidateUndefined: Self = StObject.set(x, "noValidate", js.undefined)
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
      
      @scala.inline
      def setOnAbort(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onAbort", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAbortUndefined: Self = StObject.set(x, "onAbort", js.undefined)
      
      @scala.inline
      def setOnAnimationEnd(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      @scala.inline
      def setOnAnimationIteration(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationIteration", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationIterationUndefined: Self = StObject.set(x, "onAnimationIteration", js.undefined)
      
      @scala.inline
      def setOnAnimationStart(value: SyntheticAnimationEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAnimationStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAnimationStartUndefined: Self = StObject.set(x, "onAnimationStart", js.undefined)
      
      @scala.inline
      def setOnAuxClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onAuxClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnAuxClickUndefined: Self = StObject.set(x, "onAuxClick", js.undefined)
      
      @scala.inline
      def setOnBeforeInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onBeforeInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBeforeInputUndefined: Self = StObject.set(x, "onBeforeInput", js.undefined)
      
      @scala.inline
      def setOnBlur(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onBlur", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnBlurUndefined: Self = StObject.set(x, "onBlur", js.undefined)
      
      @scala.inline
      def setOnCanPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onCanPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThrough(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onCanPlayThrough", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCanPlayThroughUndefined: Self = StObject.set(x, "onCanPlayThrough", js.undefined)
      
      @scala.inline
      def setOnCanPlayUndefined: Self = StObject.set(x, "onCanPlay", js.undefined)
      
      @scala.inline
      def setOnChange(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnChangeUndefined: Self = StObject.set(x, "onChange", js.undefined)
      
      @scala.inline
      def setOnClick(
        value: (js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]]) with js.UndefOr[MouseEventHandler[HTMLDivElement]]
      ): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnCompositionEnd(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionEndUndefined: Self = StObject.set(x, "onCompositionEnd", js.undefined)
      
      @scala.inline
      def setOnCompositionStart(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionStartUndefined: Self = StObject.set(x, "onCompositionStart", js.undefined)
      
      @scala.inline
      def setOnCompositionUpdate(value: SyntheticCompositionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCompositionUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCompositionUpdateUndefined: Self = StObject.set(x, "onCompositionUpdate", js.undefined)
      
      @scala.inline
      def setOnContextMenu(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnContextMenuUndefined: Self = StObject.set(x, "onContextMenu", js.undefined)
      
      @scala.inline
      def setOnCopy(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCopy", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCopyUndefined: Self = StObject.set(x, "onCopy", js.undefined)
      
      @scala.inline
      def setOnCut(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onCut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnCutUndefined: Self = StObject.set(x, "onCut", js.undefined)
      
      @scala.inline
      def setOnDoubleClick(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDoubleClick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDoubleClickUndefined: Self = StObject.set(x, "onDoubleClick", js.undefined)
      
      @scala.inline
      def setOnDrag(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrag", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnd(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEndUndefined: Self = StObject.set(x, "onDragEnd", js.undefined)
      
      @scala.inline
      def setOnDragEnter(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragEnterUndefined: Self = StObject.set(x, "onDragEnter", js.undefined)
      
      @scala.inline
      def setOnDragExit(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragExit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragExitUndefined: Self = StObject.set(x, "onDragExit", js.undefined)
      
      @scala.inline
      def setOnDragLeave(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragLeaveUndefined: Self = StObject.set(x, "onDragLeave", js.undefined)
      
      @scala.inline
      def setOnDragOver(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragOverUndefined: Self = StObject.set(x, "onDragOver", js.undefined)
      
      @scala.inline
      def setOnDragStart(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDragStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDragStartUndefined: Self = StObject.set(x, "onDragStart", js.undefined)
      
      @scala.inline
      def setOnDragUndefined: Self = StObject.set(x, "onDrag", js.undefined)
      
      @scala.inline
      def setOnDrop(value: DragEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onDrop", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDropUndefined: Self = StObject.set(x, "onDrop", js.undefined)
      
      @scala.inline
      def setOnDurationChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onDurationChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnDurationChangeUndefined: Self = StObject.set(x, "onDurationChange", js.undefined)
      
      @scala.inline
      def setOnEmptied(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEmptied", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEmptiedUndefined: Self = StObject.set(x, "onEmptied", js.undefined)
      
      @scala.inline
      def setOnEncrypted(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEncrypted", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEncryptedUndefined: Self = StObject.set(x, "onEncrypted", js.undefined)
      
      @scala.inline
      def setOnEnded(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onEnded", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEndedUndefined: Self = StObject.set(x, "onEnded", js.undefined)
      
      @scala.inline
      def setOnError(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onError", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnErrorUndefined: Self = StObject.set(x, "onError", js.undefined)
      
      @scala.inline
      def setOnFocus(value: SyntheticFocusEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onFocus", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnFocusUndefined: Self = StObject.set(x, "onFocus", js.undefined)
      
      @scala.inline
      def setOnInput(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onInput", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInputUndefined: Self = StObject.set(x, "onInput", js.undefined)
      
      @scala.inline
      def setOnInvalid(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onInvalid", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnInvalidUndefined: Self = StObject.set(x, "onInvalid", js.undefined)
      
      @scala.inline
      def setOnKeyDown(
        value: (js.UndefOr[js.Function1[/* e */ SyntheticKeyboardEvent[HTMLElement], Unit]]) with js.UndefOr[KeyboardEventHandler[HTMLDivElement]]
      ): Self = StObject.set(x, "onKeyDown", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnKeyPress(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyPress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyPressUndefined: Self = StObject.set(x, "onKeyPress", js.undefined)
      
      @scala.inline
      def setOnKeyUp(value: SyntheticKeyboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onKeyUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnKeyUpUndefined: Self = StObject.set(x, "onKeyUp", js.undefined)
      
      @scala.inline
      def setOnLoad(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStart(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadStartUndefined: Self = StObject.set(x, "onLoadStart", js.undefined)
      
      @scala.inline
      def setOnLoadUndefined: Self = StObject.set(x, "onLoad", js.undefined)
      
      @scala.inline
      def setOnLoadedData(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadedData", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedDataUndefined: Self = StObject.set(x, "onLoadedData", js.undefined)
      
      @scala.inline
      def setOnLoadedMetadata(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onLoadedMetadata", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLoadedMetadataUndefined: Self = StObject.set(x, "onLoadedMetadata", js.undefined)
      
      @scala.inline
      def setOnMouseDown(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseDownUndefined: Self = StObject.set(x, "onMouseDown", js.undefined)
      
      @scala.inline
      def setOnMouseEnter(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      @scala.inline
      def setOnMouseLeave(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      @scala.inline
      def setOnMouseMove(
        value: (js.UndefOr[js.Function1[/* e */ SyntheticMouseEvent[HTMLElement], Unit]]) with js.UndefOr[MouseEventHandler[HTMLDivElement]]
      ): Self = StObject.set(x, "onMouseMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnMouseOut(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOutUndefined: Self = StObject.set(x, "onMouseOut", js.undefined)
      
      @scala.inline
      def setOnMouseOver(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseOverUndefined: Self = StObject.set(x, "onMouseOver", js.undefined)
      
      @scala.inline
      def setOnMouseUp(value: SyntheticMouseEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onMouseUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnMouseUpUndefined: Self = StObject.set(x, "onMouseUp", js.undefined)
      
      @scala.inline
      def setOnPaste(value: SyntheticClipboardEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPaste", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPasteUndefined: Self = StObject.set(x, "onPaste", js.undefined)
      
      @scala.inline
      def setOnPause(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPause", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPauseUndefined: Self = StObject.set(x, "onPause", js.undefined)
      
      @scala.inline
      def setOnPlay(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPlay", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayUndefined: Self = StObject.set(x, "onPlay", js.undefined)
      
      @scala.inline
      def setOnPlaying(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onPlaying", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPlayingUndefined: Self = StObject.set(x, "onPlaying", js.undefined)
      
      @scala.inline
      def setOnPointerCancel(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerCancelUndefined: Self = StObject.set(x, "onPointerCancel", js.undefined)
      
      @scala.inline
      def setOnPointerDown(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerDown", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerDownUndefined: Self = StObject.set(x, "onPointerDown", js.undefined)
      
      @scala.inline
      def setOnPointerEnter(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerEnter", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerEnterUndefined: Self = StObject.set(x, "onPointerEnter", js.undefined)
      
      @scala.inline
      def setOnPointerLeave(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerLeave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerLeaveUndefined: Self = StObject.set(x, "onPointerLeave", js.undefined)
      
      @scala.inline
      def setOnPointerMove(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerMoveUndefined: Self = StObject.set(x, "onPointerMove", js.undefined)
      
      @scala.inline
      def setOnPointerOut(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOut", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOutUndefined: Self = StObject.set(x, "onPointerOut", js.undefined)
      
      @scala.inline
      def setOnPointerOver(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerOver", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerOverUndefined: Self = StObject.set(x, "onPointerOver", js.undefined)
      
      @scala.inline
      def setOnPointerUp(value: SyntheticPointerEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onPointerUp", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnPointerUpUndefined: Self = StObject.set(x, "onPointerUp", js.undefined)
      
      @scala.inline
      def setOnProgress(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onProgress", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnProgressUndefined: Self = StObject.set(x, "onProgress", js.undefined)
      
      @scala.inline
      def setOnRateChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onRateChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnRateChangeUndefined: Self = StObject.set(x, "onRateChange", js.undefined)
      
      @scala.inline
      def setOnReset(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onReset", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnResetUndefined: Self = StObject.set(x, "onReset", js.undefined)
      
      @scala.inline
      def setOnScroll(value: SyntheticUIEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setOnSeeked(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSeeked", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekedUndefined: Self = StObject.set(x, "onSeeked", js.undefined)
      
      @scala.inline
      def setOnSeeking(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSeeking", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSeekingUndefined: Self = StObject.set(x, "onSeeking", js.undefined)
      
      @scala.inline
      def setOnSelect(value: js.UndefOr[js.Function0[Unit]] with js.UndefOr[ReactEventHandler[HTMLDivElement]]): Self = StObject.set(x, "onSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnStalled(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onStalled", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnStalledUndefined: Self = StObject.set(x, "onStalled", js.undefined)
      
      @scala.inline
      def setOnSubmit(value: SyntheticEvent[EventTarget with HTMLDivElement, Event] => Unit): Self = StObject.set(x, "onSubmit", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSubmitUndefined: Self = StObject.set(x, "onSubmit", js.undefined)
      
      @scala.inline
      def setOnSuspend(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onSuspend", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSuspendUndefined: Self = StObject.set(x, "onSuspend", js.undefined)
      
      @scala.inline
      def setOnTimeUpdate(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onTimeUpdate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTimeUpdateUndefined: Self = StObject.set(x, "onTimeUpdate", js.undefined)
      
      @scala.inline
      def setOnTouchCancel(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchCancel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchCancelUndefined: Self = StObject.set(x, "onTouchCancel", js.undefined)
      
      @scala.inline
      def setOnTouchEnd(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchEndUndefined: Self = StObject.set(x, "onTouchEnd", js.undefined)
      
      @scala.inline
      def setOnTouchMove(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchMove", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchMoveUndefined: Self = StObject.set(x, "onTouchMove", js.undefined)
      
      @scala.inline
      def setOnTouchStart(value: SyntheticTouchEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTouchStart", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTouchStartUndefined: Self = StObject.set(x, "onTouchStart", js.undefined)
      
      @scala.inline
      def setOnTransitionEnd(value: SyntheticTransitionEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onTransitionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnTransitionEndUndefined: Self = StObject.set(x, "onTransitionEnd", js.undefined)
      
      @scala.inline
      def setOnVolumeChange(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onVolumeChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnVolumeChangeUndefined: Self = StObject.set(x, "onVolumeChange", js.undefined)
      
      @scala.inline
      def setOnWaiting(value: SyntheticEvent[Event, HTMLDivElement] => Unit): Self = StObject.set(x, "onWaiting", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWaitingUndefined: Self = StObject.set(x, "onWaiting", js.undefined)
      
      @scala.inline
      def setOnWheel(value: SyntheticWheelEvent[HTMLDivElement] => Unit): Self = StObject.set(x, "onWheel", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnWheelUndefined: Self = StObject.set(x, "onWheel", js.undefined)
      
      @scala.inline
      def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpenUndefined: Self = StObject.set(x, "open", js.undefined)
      
      @scala.inline
      def setOptimum(value: Double): Self = StObject.set(x, "optimum", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptimumUndefined: Self = StObject.set(x, "optimum", js.undefined)
      
      @scala.inline
      def setPattern(value: String): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
      
      @scala.inline
      def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      @scala.inline
      def setPlaysInline(value: Boolean): Self = StObject.set(x, "playsInline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlaysInlineUndefined: Self = StObject.set(x, "playsInline", js.undefined)
      
      @scala.inline
      def setPoster(value: String): Self = StObject.set(x, "poster", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPosterUndefined: Self = StObject.set(x, "poster", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setPreload(value: String): Self = StObject.set(x, "preload", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreloadUndefined: Self = StObject.set(x, "preload", js.undefined)
      
      @scala.inline
      def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPropertyUndefined: Self = StObject.set(x, "property", js.undefined)
      
      @scala.inline
      def setRadioGroup(value: String): Self = StObject.set(x, "radioGroup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadioGroupUndefined: Self = StObject.set(x, "radioGroup", js.undefined)
      
      @scala.inline
      def setReadOnly(value: Boolean): Self = StObject.set(x, "readOnly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadOnlyUndefined: Self = StObject.set(x, "readOnly", js.undefined)
      
      @scala.inline
      def setRef(value: LegacyRef[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefFunction1(value: /* instance */ HTMLDivElement | Null => Unit): Self = StObject.set(x, "ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def setRefNull: Self = StObject.set(x, "ref", null)
      
      @scala.inline
      def setRefRefObject(value: ReactRef[HTMLDivElement]): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
      
      @scala.inline
      def setRel(value: String): Self = StObject.set(x, "rel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRelUndefined: Self = StObject.set(x, "rel", js.undefined)
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
      
      @scala.inline
      def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceUndefined: Self = StObject.set(x, "resource", js.undefined)
      
      @scala.inline
      def setResults(value: Double): Self = StObject.set(x, "results", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultsUndefined: Self = StObject.set(x, "results", js.undefined)
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReversedUndefined: Self = StObject.set(x, "reversed", js.undefined)
      
      @scala.inline
      def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleUndefined: Self = StObject.set(x, "role", js.undefined)
      
      @scala.inline
      def setRowSpan(value: Double): Self = StObject.set(x, "rowSpan", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowSpanUndefined: Self = StObject.set(x, "rowSpan", js.undefined)
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setSandbox(value: String): Self = StObject.set(x, "sandbox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSandboxUndefined: Self = StObject.set(x, "sandbox", js.undefined)
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      @scala.inline
      def setScoped(value: Boolean): Self = StObject.set(x, "scoped", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScopedUndefined: Self = StObject.set(x, "scoped", js.undefined)
      
      @scala.inline
      def setScrolling(value: String): Self = StObject.set(x, "scrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollingUndefined: Self = StObject.set(x, "scrolling", js.undefined)
      
      @scala.inline
      def setSeamless(value: Boolean): Self = StObject.set(x, "seamless", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeamlessUndefined: Self = StObject.set(x, "seamless", js.undefined)
      
      @scala.inline
      def setSecurity(value: String): Self = StObject.set(x, "security", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityUndefined: Self = StObject.set(x, "security", js.undefined)
      
      @scala.inline
      def setSelected(value: Boolean): Self = StObject.set(x, "selected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedUndefined: Self = StObject.set(x, "selected", js.undefined)
      
      @scala.inline
      def setSetState(value: /* s */ State => PartialState): Self = StObject.set(x, "setState", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSetStateUndefined: Self = StObject.set(x, "setState", js.undefined)
      
      @scala.inline
      def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setSizes(value: String): Self = StObject.set(x, "sizes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizesUndefined: Self = StObject.set(x, "sizes", js.undefined)
      
      @scala.inline
      def setSlot(value: String): Self = StObject.set(x, "slot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlotUndefined: Self = StObject.set(x, "slot", js.undefined)
      
      @scala.inline
      def setSpan(value: Double): Self = StObject.set(x, "span", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpanUndefined: Self = StObject.set(x, "span", js.undefined)
      
      @scala.inline
      def setSpellCheck(value: Booleanish): Self = StObject.set(x, "spellCheck", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpellCheckUndefined: Self = StObject.set(x, "spellCheck", js.undefined)
      
      @scala.inline
      def setSrc(value: String): Self = StObject.set(x, "src", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDoc(value: String): Self = StObject.set(x, "srcDoc", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcDocUndefined: Self = StObject.set(x, "srcDoc", js.undefined)
      
      @scala.inline
      def setSrcLang(value: String): Self = StObject.set(x, "srcLang", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcLangUndefined: Self = StObject.set(x, "srcLang", js.undefined)
      
      @scala.inline
      def setSrcSet(value: String): Self = StObject.set(x, "srcSet", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcSetUndefined: Self = StObject.set(x, "srcSet", js.undefined)
      
      @scala.inline
      def setSrcUndefined: Self = StObject.set(x, "src", js.undefined)
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setState(value: State): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStep(value: Double | String): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSummaryUndefined: Self = StObject.set(x, "summary", js.undefined)
      
      @scala.inline
      def setSuppressContentEditableWarning(value: Boolean): Self = StObject.set(x, "suppressContentEditableWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressContentEditableWarningUndefined: Self = StObject.set(x, "suppressContentEditableWarning", js.undefined)
      
      @scala.inline
      def setSuppressHydrationWarning(value: Boolean): Self = StObject.set(x, "suppressHydrationWarning", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuppressHydrationWarningUndefined: Self = StObject.set(x, "suppressHydrationWarning", js.undefined)
      
      @scala.inline
      def setTabIndex(value: Double): Self = StObject.set(x, "tabIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTabIndexUndefined: Self = StObject.set(x, "tabIndex", js.undefined)
      
      @scala.inline
      def setTarget(value: String): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
      
      @scala.inline
      def setTranslate(value: yes | no): Self = StObject.set(x, "translate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTranslateUndefined: Self = StObject.set(x, "translate", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setTypeof(value: String): Self = StObject.set(x, "typeof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeofUndefined: Self = StObject.set(x, "typeof", js.undefined)
      
      @scala.inline
      def setUnselectable(value: on | off): Self = StObject.set(x, "unselectable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnselectableUndefined: Self = StObject.set(x, "unselectable", js.undefined)
      
      @scala.inline
      def setUseMap(value: String): Self = StObject.set(x, "useMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseMapUndefined: Self = StObject.set(x, "useMap", js.undefined)
      
      @scala.inline
      def setValue(value: String | js.Array[String] | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
      
      @scala.inline
      def setValueVarargs(value: String*): Self = StObject.set(x, "value", js.Array(value :_*))
      
      @scala.inline
      def setVocab(value: String): Self = StObject.set(x, "vocab", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVocabUndefined: Self = StObject.set(x, "vocab", js.undefined)
      
      @scala.inline
      def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
      
      @scala.inline
      def setWmode(value: String): Self = StObject.set(x, "wmode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWmodeUndefined: Self = StObject.set(x, "wmode", js.undefined)
      
      @scala.inline
      def setWrap(value: String): Self = StObject.set(x, "wrap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWrapUndefined: Self = StObject.set(x, "wrap", js.undefined)
      
      @scala.inline
      def set_ref(value: /* node */ HTMLElement => Unit): Self = StObject.set(x, "_ref", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_refUndefined: Self = StObject.set(x, "_ref", js.undefined)
    }
  }
  
  type MenuLinkProps[T /* <: SupportedMenuLinkComponent */] = ResolvedMenuLinkProps[T] with As[T]
  
  type MenuListProps = (DetailedHTMLProps[HTMLAttributes[HTMLDivElement], HTMLDivElement]) with Children
  
  @js.native
  trait MenuProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
  }
  object MenuProps {
    
    @scala.inline
    def apply(): MenuProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MenuProps]
    }
    
    @scala.inline
    implicit class MenuPropsMutableBuilder[Self <: MenuProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    }
  }
  
  type ResolvedMenuLinkComponent[T] = ReactComponentClass[T] | T
  
  type ResolvedMenuLinkProps[T] = T | (/* import warning: importer.ImportType#apply Failed type conversion: react.react.<global>.JSX.IntrinsicElements[T] */ js.Any)
  
  @js.native
  trait State extends StObject {
    
    var buttonId: String = js.native
    
    var buttonRect: js.UndefOr[ButtonRect] = js.native
    
    var closingWithClick: Boolean = js.native
    
    var isOpen: Boolean = js.native
    
    var selectionIndex: Double = js.native
  }
  object State {
    
    @scala.inline
    def apply(buttonId: String, closingWithClick: Boolean, isOpen: Boolean, selectionIndex: Double): State = {
      val __obj = js.Dynamic.literal(buttonId = buttonId.asInstanceOf[js.Any], closingWithClick = closingWithClick.asInstanceOf[js.Any], isOpen = isOpen.asInstanceOf[js.Any], selectionIndex = selectionIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[State]
    }
    
    @scala.inline
    implicit class StateMutableBuilder[Self <: State] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setButtonId(value: String): Self = StObject.set(x, "buttonId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonRect(value: ButtonRect): Self = StObject.set(x, "buttonRect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setButtonRectUndefined: Self = StObject.set(x, "buttonRect", js.undefined)
      
      @scala.inline
      def setClosingWithClick(value: Boolean): Self = StObject.set(x, "closingWithClick", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsOpen(value: Boolean): Self = StObject.set(x, "isOpen", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionIndex(value: Double): Self = StObject.set(x, "selectionIndex", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - js.Object
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.a
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.abbr
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.address
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.area
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.article
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.aside
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.audio
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.b
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.base
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.bdi
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.bdo
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.big
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.blockquote
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.body
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.br
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.button
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.canvas
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.caption
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.cite
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.code
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.col
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.colgroup
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.data
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.datalist
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.dd
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.del
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.details
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.dfn
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.dialog
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.div
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.dl
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.dt
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.em
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.embed
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.fieldset
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.figcaption
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.figure
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.footer
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.form
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.h1
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.h2
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.h3
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.h4
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.h5
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.h6
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.head
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.header
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.hgroup
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.hr
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.html
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.i
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.iframe
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.img
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.input
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.ins
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.kbd
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.keygen
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.label
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.legend
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.li
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.link
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.main
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.map
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.mark
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.menu
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.menuitem
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.meta
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.meter
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.nav
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.noindex
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.noscript
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.`object`
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.ol
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.optgroup
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.option
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.output
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.p
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.param
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.picture
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.pre
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.progress
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.q
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.rp
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.rt
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.ruby
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.s
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.samp
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.slot
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.script
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.section
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.select
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.small
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.source
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.span
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.strong
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.style
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.sub
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.summary
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.sup
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.table
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.template
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.tbody
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.td
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.textarea
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.tfoot
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.th
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.thead
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.time
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.title
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.tr
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.track
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.u
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.ul
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.`var`
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.video
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.wbr
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.webview
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.svg
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.animate
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.animateMotion
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.animateTransform
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.circle
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.clipPath
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.defs
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.desc
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.ellipse
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feBlend
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feColorMatrix
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feComponentTransfer
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feComposite
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feConvolveMatrix
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feDiffuseLighting
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feDisplacementMap
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feDistantLight
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feDropShadow
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feFlood
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feFuncA
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feFuncB
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feFuncG
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feFuncR
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feGaussianBlur
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feImage
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feMerge
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feMergeNode
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feMorphology
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feOffset
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.fePointLight
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feSpecularLighting
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feSpotLight
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feTile
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.feTurbulence
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.filter
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.foreignObject
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.g
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.image
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.line
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.linearGradient
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.marker
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.mask
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.metadata
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.mpath
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.path
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.pattern
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.polygon
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.polyline
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.radialGradient
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.rect
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.stop
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.switch
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.symbol
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.text
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.textPath
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.tspan
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.use
    - typingsSlinky.reachMenuButton.reachMenuButtonStrings.view
  */
  type SupportedMenuLinkComponent = _SupportedMenuLinkComponent | js.Object
  
  trait _SupportedMenuLinkComponent extends StObject
}
