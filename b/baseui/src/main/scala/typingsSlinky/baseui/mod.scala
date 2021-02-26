package typingsSlinky.baseui

import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import typingsSlinky.baseui.anon.ClassName
import typingsSlinky.baseui.anon.PartialLocale
import typingsSlinky.baseui.anon.Theme
import typingsSlinky.baseui.anon.ThemeT
import typingsSlinky.baseui.baseuiStrings.`object`
import typingsSlinky.baseui.baseuiStrings.`var`
import typingsSlinky.baseui.baseuiStrings.a
import typingsSlinky.baseui.baseuiStrings.abbr
import typingsSlinky.baseui.baseuiStrings.address
import typingsSlinky.baseui.baseuiStrings.animate
import typingsSlinky.baseui.baseuiStrings.animateMotion
import typingsSlinky.baseui.baseuiStrings.animateTransform
import typingsSlinky.baseui.baseuiStrings.area
import typingsSlinky.baseui.baseuiStrings.article
import typingsSlinky.baseui.baseuiStrings.aside
import typingsSlinky.baseui.baseuiStrings.audio
import typingsSlinky.baseui.baseuiStrings.b
import typingsSlinky.baseui.baseuiStrings.base
import typingsSlinky.baseui.baseuiStrings.bdi
import typingsSlinky.baseui.baseuiStrings.bdo
import typingsSlinky.baseui.baseuiStrings.big
import typingsSlinky.baseui.baseuiStrings.blockquote
import typingsSlinky.baseui.baseuiStrings.body
import typingsSlinky.baseui.baseuiStrings.br_
import typingsSlinky.baseui.baseuiStrings.button
import typingsSlinky.baseui.baseuiStrings.canvas
import typingsSlinky.baseui.baseuiStrings.caption
import typingsSlinky.baseui.baseuiStrings.circle
import typingsSlinky.baseui.baseuiStrings.cite
import typingsSlinky.baseui.baseuiStrings.clipPath
import typingsSlinky.baseui.baseuiStrings.code
import typingsSlinky.baseui.baseuiStrings.col
import typingsSlinky.baseui.baseuiStrings.colgroup
import typingsSlinky.baseui.baseuiStrings.data
import typingsSlinky.baseui.baseuiStrings.datalist
import typingsSlinky.baseui.baseuiStrings.dd
import typingsSlinky.baseui.baseuiStrings.defs
import typingsSlinky.baseui.baseuiStrings.del
import typingsSlinky.baseui.baseuiStrings.desc_
import typingsSlinky.baseui.baseuiStrings.details
import typingsSlinky.baseui.baseuiStrings.dfn
import typingsSlinky.baseui.baseuiStrings.dialog
import typingsSlinky.baseui.baseuiStrings.div
import typingsSlinky.baseui.baseuiStrings.dl
import typingsSlinky.baseui.baseuiStrings.dt
import typingsSlinky.baseui.baseuiStrings.ellipse
import typingsSlinky.baseui.baseuiStrings.em
import typingsSlinky.baseui.baseuiStrings.embed
import typingsSlinky.baseui.baseuiStrings.feBlend
import typingsSlinky.baseui.baseuiStrings.feColorMatrix
import typingsSlinky.baseui.baseuiStrings.feComponentTransfer
import typingsSlinky.baseui.baseuiStrings.feComposite
import typingsSlinky.baseui.baseuiStrings.feConvolveMatrix
import typingsSlinky.baseui.baseuiStrings.feDiffuseLighting
import typingsSlinky.baseui.baseuiStrings.feDisplacementMap
import typingsSlinky.baseui.baseuiStrings.feDistantLight
import typingsSlinky.baseui.baseuiStrings.feDropShadow
import typingsSlinky.baseui.baseuiStrings.feFlood
import typingsSlinky.baseui.baseuiStrings.feFuncA
import typingsSlinky.baseui.baseuiStrings.feFuncB
import typingsSlinky.baseui.baseuiStrings.feFuncG
import typingsSlinky.baseui.baseuiStrings.feFuncR
import typingsSlinky.baseui.baseuiStrings.feGaussianBlur
import typingsSlinky.baseui.baseuiStrings.feImage
import typingsSlinky.baseui.baseuiStrings.feMerge
import typingsSlinky.baseui.baseuiStrings.feMergeNode
import typingsSlinky.baseui.baseuiStrings.feMorphology
import typingsSlinky.baseui.baseuiStrings.feOffset
import typingsSlinky.baseui.baseuiStrings.fePointLight
import typingsSlinky.baseui.baseuiStrings.feSpecularLighting
import typingsSlinky.baseui.baseuiStrings.feSpotLight
import typingsSlinky.baseui.baseuiStrings.feTile
import typingsSlinky.baseui.baseuiStrings.feTurbulence
import typingsSlinky.baseui.baseuiStrings.fieldset
import typingsSlinky.baseui.baseuiStrings.figcaption
import typingsSlinky.baseui.baseuiStrings.figure
import typingsSlinky.baseui.baseuiStrings.filter
import typingsSlinky.baseui.baseuiStrings.footer
import typingsSlinky.baseui.baseuiStrings.foreignObject
import typingsSlinky.baseui.baseuiStrings.form
import typingsSlinky.baseui.baseuiStrings.g
import typingsSlinky.baseui.baseuiStrings.h1
import typingsSlinky.baseui.baseuiStrings.h2
import typingsSlinky.baseui.baseuiStrings.h3
import typingsSlinky.baseui.baseuiStrings.h4
import typingsSlinky.baseui.baseuiStrings.h5
import typingsSlinky.baseui.baseuiStrings.h6
import typingsSlinky.baseui.baseuiStrings.head
import typingsSlinky.baseui.baseuiStrings.header
import typingsSlinky.baseui.baseuiStrings.hgroup
import typingsSlinky.baseui.baseuiStrings.hr_
import typingsSlinky.baseui.baseuiStrings.html
import typingsSlinky.baseui.baseuiStrings.i
import typingsSlinky.baseui.baseuiStrings.iframe
import typingsSlinky.baseui.baseuiStrings.image
import typingsSlinky.baseui.baseuiStrings.img
import typingsSlinky.baseui.baseuiStrings.input
import typingsSlinky.baseui.baseuiStrings.ins
import typingsSlinky.baseui.baseuiStrings.kbd
import typingsSlinky.baseui.baseuiStrings.keygen
import typingsSlinky.baseui.baseuiStrings.label
import typingsSlinky.baseui.baseuiStrings.legend
import typingsSlinky.baseui.baseuiStrings.li_
import typingsSlinky.baseui.baseuiStrings.line
import typingsSlinky.baseui.baseuiStrings.linearGradient
import typingsSlinky.baseui.baseuiStrings.link
import typingsSlinky.baseui.baseuiStrings.main
import typingsSlinky.baseui.baseuiStrings.map
import typingsSlinky.baseui.baseuiStrings.mark
import typingsSlinky.baseui.baseuiStrings.marker
import typingsSlinky.baseui.baseuiStrings.mask
import typingsSlinky.baseui.baseuiStrings.menu
import typingsSlinky.baseui.baseuiStrings.menuitem
import typingsSlinky.baseui.baseuiStrings.meta
import typingsSlinky.baseui.baseuiStrings.metadata
import typingsSlinky.baseui.baseuiStrings.meter
import typingsSlinky.baseui.baseuiStrings.mpath
import typingsSlinky.baseui.baseuiStrings.nav
import typingsSlinky.baseui.baseuiStrings.noindex
import typingsSlinky.baseui.baseuiStrings.noscript
import typingsSlinky.baseui.baseuiStrings.ol
import typingsSlinky.baseui.baseuiStrings.optgroup
import typingsSlinky.baseui.baseuiStrings.option
import typingsSlinky.baseui.baseuiStrings.output
import typingsSlinky.baseui.baseuiStrings.p
import typingsSlinky.baseui.baseuiStrings.param
import typingsSlinky.baseui.baseuiStrings.path
import typingsSlinky.baseui.baseuiStrings.pattern
import typingsSlinky.baseui.baseuiStrings.picture
import typingsSlinky.baseui.baseuiStrings.polygon
import typingsSlinky.baseui.baseuiStrings.polyline
import typingsSlinky.baseui.baseuiStrings.pre
import typingsSlinky.baseui.baseuiStrings.progress
import typingsSlinky.baseui.baseuiStrings.q
import typingsSlinky.baseui.baseuiStrings.radialGradient
import typingsSlinky.baseui.baseuiStrings.rect
import typingsSlinky.baseui.baseuiStrings.rp
import typingsSlinky.baseui.baseuiStrings.rt
import typingsSlinky.baseui.baseuiStrings.ruby
import typingsSlinky.baseui.baseuiStrings.s
import typingsSlinky.baseui.baseuiStrings.samp
import typingsSlinky.baseui.baseuiStrings.script
import typingsSlinky.baseui.baseuiStrings.section
import typingsSlinky.baseui.baseuiStrings.select
import typingsSlinky.baseui.baseuiStrings.slot
import typingsSlinky.baseui.baseuiStrings.small_
import typingsSlinky.baseui.baseuiStrings.source
import typingsSlinky.baseui.baseuiStrings.span
import typingsSlinky.baseui.baseuiStrings.stop
import typingsSlinky.baseui.baseuiStrings.strong
import typingsSlinky.baseui.baseuiStrings.style
import typingsSlinky.baseui.baseuiStrings.sub
import typingsSlinky.baseui.baseuiStrings.summary
import typingsSlinky.baseui.baseuiStrings.sup
import typingsSlinky.baseui.baseuiStrings.svg
import typingsSlinky.baseui.baseuiStrings.switch
import typingsSlinky.baseui.baseuiStrings.symbol
import typingsSlinky.baseui.baseuiStrings.table
import typingsSlinky.baseui.baseuiStrings.tbody
import typingsSlinky.baseui.baseuiStrings.td_
import typingsSlinky.baseui.baseuiStrings.template
import typingsSlinky.baseui.baseuiStrings.text
import typingsSlinky.baseui.baseuiStrings.textPath
import typingsSlinky.baseui.baseuiStrings.textarea
import typingsSlinky.baseui.baseuiStrings.tfoot
import typingsSlinky.baseui.baseuiStrings.th_
import typingsSlinky.baseui.baseuiStrings.thead
import typingsSlinky.baseui.baseuiStrings.time
import typingsSlinky.baseui.baseuiStrings.title
import typingsSlinky.baseui.baseuiStrings.tr_
import typingsSlinky.baseui.baseuiStrings.track
import typingsSlinky.baseui.baseuiStrings.tspan
import typingsSlinky.baseui.baseuiStrings.u
import typingsSlinky.baseui.baseuiStrings.ul
import typingsSlinky.baseui.baseuiStrings.use
import typingsSlinky.baseui.baseuiStrings.video
import typingsSlinky.baseui.baseuiStrings.view
import typingsSlinky.baseui.baseuiStrings.wbr
import typingsSlinky.baseui.baseuiStrings.webview
import typingsSlinky.react.mod.ComponentProps
import typingsSlinky.std.Exclude
import typingsSlinky.std.Partial
import typingsSlinky.std.Pick
import typingsSlinky.styletronReact.mod.StyletronComponent
import typingsSlinky.styletronStandard.mod.StyleObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("baseui", "BaseProvider")
  @js.native
  val BaseProvider: ReactComponentClass[BaseProviderProps] = js.native
  
  @JSImport("baseui", "DarkTheme")
  @js.native
  val DarkTheme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
  
  @JSImport("baseui", "DarkThemeMove")
  @js.native
  val DarkThemeMove: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
  
  @JSImport("baseui", "LightTheme")
  @js.native
  val LightTheme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
  
  @JSImport("baseui", "LightThemeMove")
  @js.native
  val LightThemeMove: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
  
  @JSImport("baseui", "LocaleProvider")
  @js.native
  val LocaleProvider: ReactComponentClass[LocaleProviderProps] = js.native
  
  @JSImport("baseui", "ThemeProvider")
  @js.native
  val ThemeProvider: ReactComponentClass[ThemeProviderProps] = js.native
  
  @JSImport("baseui", "createDarkTheme")
  @js.native
  def createDarkTheme[P /* <: js.Object */](
    primitives: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemePrimitives */ _
    ]
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any) with P = js.native
  @JSImport("baseui", "createDarkTheme")
  @js.native
  def createDarkTheme[P /* <: js.Object */](
    primitives: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemePrimitives */ _
    ],
    overrides: P
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any) with P = js.native
  
  @JSImport("baseui", "createLightTheme")
  @js.native
  def createLightTheme[P /* <: js.Object */](
    primitives: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemePrimitives */ _
    ]
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any) with P = js.native
  @JSImport("baseui", "createLightTheme")
  @js.native
  def createLightTheme[P /* <: js.Object */](
    primitives: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemePrimitives */ _
    ],
    overrides: P
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any) with P = js.native
  
  @JSImport("baseui", "createTheme")
  @js.native
  def createTheme[P /* <: js.Object */](
    primitives: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemePrimitives */ _
    ]
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any) with P = js.native
  @JSImport("baseui", "createTheme")
  @js.native
  def createTheme[P /* <: js.Object */](
    primitives: Partial[
      /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemePrimitives */ _
    ],
    overrides: P
  ): (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any) with P = js.native
  
  @JSImport("baseui", "createThemedStyled")
  @js.native
  def createThemedStyled[Theme](): StyledFn[Theme] = js.native
  
  @JSImport("baseui", "createThemedUseStyletron")
  @js.native
  def createThemedUseStyletron[Theme](): UseStyletronFn[Theme] = js.native
  
  @JSImport("baseui", "createThemedWithStyle")
  @js.native
  def createThemedWithStyle[Theme](): WithStyleFn[Theme] = js.native
  
  @JSImport("baseui", "darkThemePrimitives")
  @js.native
  val darkThemePrimitives: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemePrimitives */ js.Any = js.native
  
  @JSImport("baseui", "lightThemePrimitives")
  @js.native
  val lightThemePrimitives: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ThemePrimitives */ js.Any = js.native
  
  @JSImport("baseui", "mergeOverrides")
  @js.native
  def mergeOverrides[T](): js.Any = js.native
  @JSImport("baseui", "mergeOverrides")
  @js.native
  def mergeOverrides[T](
    target: js.UndefOr[scala.Nothing],
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Overrides<T> */ js.Any
  ): js.Any = js.native
  @JSImport("baseui", "mergeOverrides")
  @js.native
  def mergeOverrides[T](
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Overrides<T> */ js.Any
  ): js.Any = js.native
  @JSImport("baseui", "mergeOverrides")
  @js.native
  def mergeOverrides[T](
    target: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Overrides<T> */ js.Any,
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Overrides<T> */ js.Any
  ): js.Any = js.native
  
  @JSImport("baseui", "styled")
  @js.native
  def styled[P /* <: js.Object */, C /* <: ReactComponentClass[_] */, T](component: C, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[C], 
      Exclude[/* keyof react.react.ComponentProps<C> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled[P /* <: js.Object */, C /* <: ReactComponentClass[_] */, T](component: C, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[C], 
      Exclude[/* keyof react.react.ComponentProps<C> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_a[P /* <: js.Object */, T](component: a, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[a], 
      Exclude[/* keyof react.react.ComponentProps<'a'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_a[P /* <: js.Object */, T](component: a, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[a], 
      Exclude[/* keyof react.react.ComponentProps<'a'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_abbr[P /* <: js.Object */, T](component: abbr, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[abbr], 
      Exclude[/* keyof react.react.ComponentProps<'abbr'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_abbr[P /* <: js.Object */, T](component: abbr, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[abbr], 
      Exclude[/* keyof react.react.ComponentProps<'abbr'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_address[P /* <: js.Object */, T](component: address, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[address], 
      Exclude[/* keyof react.react.ComponentProps<'address'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_address[P /* <: js.Object */, T](component: address, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[address], 
      Exclude[/* keyof react.react.ComponentProps<'address'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_animate[P /* <: js.Object */, T](component: animate, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[animate], 
      Exclude[/* keyof react.react.ComponentProps<'animate'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_animate[P /* <: js.Object */, T](component: animate, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[animate], 
      Exclude[/* keyof react.react.ComponentProps<'animate'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_animateMotion[P /* <: js.Object */, T](component: animateMotion, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[animateMotion], 
      Exclude[/* keyof react.react.ComponentProps<'animateMotion'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_animateMotion[P /* <: js.Object */, T](component: animateMotion, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[animateMotion], 
      Exclude[/* keyof react.react.ComponentProps<'animateMotion'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_animateTransform[P /* <: js.Object */, T](component: animateTransform, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[animateTransform], 
      Exclude[/* keyof react.react.ComponentProps<'animateTransform'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_animateTransform[P /* <: js.Object */, T](component: animateTransform, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[animateTransform], 
      Exclude[/* keyof react.react.ComponentProps<'animateTransform'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_area[P /* <: js.Object */, T](component: area, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[area], 
      Exclude[/* keyof react.react.ComponentProps<'area'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_area[P /* <: js.Object */, T](component: area, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[area], 
      Exclude[/* keyof react.react.ComponentProps<'area'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_article[P /* <: js.Object */, T](component: article, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[article], 
      Exclude[/* keyof react.react.ComponentProps<'article'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_article[P /* <: js.Object */, T](component: article, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[article], 
      Exclude[/* keyof react.react.ComponentProps<'article'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_aside[P /* <: js.Object */, T](component: aside, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[aside], 
      Exclude[/* keyof react.react.ComponentProps<'aside'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_aside[P /* <: js.Object */, T](component: aside, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[aside], 
      Exclude[/* keyof react.react.ComponentProps<'aside'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_audio[P /* <: js.Object */, T](component: audio, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[audio], 
      Exclude[/* keyof react.react.ComponentProps<'audio'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_audio[P /* <: js.Object */, T](component: audio, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[audio], 
      Exclude[/* keyof react.react.ComponentProps<'audio'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_b[P /* <: js.Object */, T](component: b, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[b], 
      Exclude[/* keyof react.react.ComponentProps<'b'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_b[P /* <: js.Object */, T](component: b, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[b], 
      Exclude[/* keyof react.react.ComponentProps<'b'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_base[P /* <: js.Object */, T](component: base, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[base], 
      Exclude[/* keyof react.react.ComponentProps<'base'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_base[P /* <: js.Object */, T](component: base, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[base], 
      Exclude[/* keyof react.react.ComponentProps<'base'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_bdi[P /* <: js.Object */, T](component: bdi, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[bdi], 
      Exclude[/* keyof react.react.ComponentProps<'bdi'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_bdi[P /* <: js.Object */, T](component: bdi, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[bdi], 
      Exclude[/* keyof react.react.ComponentProps<'bdi'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_bdo[P /* <: js.Object */, T](component: bdo, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[bdo], 
      Exclude[/* keyof react.react.ComponentProps<'bdo'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_bdo[P /* <: js.Object */, T](component: bdo, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[bdo], 
      Exclude[/* keyof react.react.ComponentProps<'bdo'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_big[P /* <: js.Object */, T](component: big, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[big], 
      Exclude[/* keyof react.react.ComponentProps<'big'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_big[P /* <: js.Object */, T](component: big, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[big], 
      Exclude[/* keyof react.react.ComponentProps<'big'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_blockquote[P /* <: js.Object */, T](component: blockquote, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[blockquote], 
      Exclude[/* keyof react.react.ComponentProps<'blockquote'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_blockquote[P /* <: js.Object */, T](component: blockquote, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[blockquote], 
      Exclude[/* keyof react.react.ComponentProps<'blockquote'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_body[P /* <: js.Object */, T](component: body, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[body], 
      Exclude[/* keyof react.react.ComponentProps<'body'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_body[P /* <: js.Object */, T](component: body, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[body], 
      Exclude[/* keyof react.react.ComponentProps<'body'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_br[P /* <: js.Object */, T](component: br_, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[br_], 
      Exclude[/* keyof react.react.ComponentProps<'br'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_br[P /* <: js.Object */, T](component: br_, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[br_], 
      Exclude[/* keyof react.react.ComponentProps<'br'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_button[P /* <: js.Object */, T](component: button, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[button], 
      Exclude[/* keyof react.react.ComponentProps<'button'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_button[P /* <: js.Object */, T](component: button, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[button], 
      Exclude[/* keyof react.react.ComponentProps<'button'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_canvas[P /* <: js.Object */, T](component: canvas, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[canvas], 
      Exclude[/* keyof react.react.ComponentProps<'canvas'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_canvas[P /* <: js.Object */, T](component: canvas, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[canvas], 
      Exclude[/* keyof react.react.ComponentProps<'canvas'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_caption[P /* <: js.Object */, T](component: caption, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[caption], 
      Exclude[/* keyof react.react.ComponentProps<'caption'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_caption[P /* <: js.Object */, T](component: caption, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[caption], 
      Exclude[/* keyof react.react.ComponentProps<'caption'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_circle[P /* <: js.Object */, T](component: circle, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[circle], 
      Exclude[/* keyof react.react.ComponentProps<'circle'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_circle[P /* <: js.Object */, T](component: circle, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[circle], 
      Exclude[/* keyof react.react.ComponentProps<'circle'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_cite[P /* <: js.Object */, T](component: cite, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[cite], 
      Exclude[/* keyof react.react.ComponentProps<'cite'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_cite[P /* <: js.Object */, T](component: cite, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[cite], 
      Exclude[/* keyof react.react.ComponentProps<'cite'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_clipPath[P /* <: js.Object */, T](component: clipPath, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[clipPath], 
      Exclude[/* keyof react.react.ComponentProps<'clipPath'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_clipPath[P /* <: js.Object */, T](component: clipPath, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[clipPath], 
      Exclude[/* keyof react.react.ComponentProps<'clipPath'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_code[P /* <: js.Object */, T](component: code, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[code], 
      Exclude[/* keyof react.react.ComponentProps<'code'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_code[P /* <: js.Object */, T](component: code, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[code], 
      Exclude[/* keyof react.react.ComponentProps<'code'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_col[P /* <: js.Object */, T](component: col, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[col], 
      Exclude[/* keyof react.react.ComponentProps<'col'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_col[P /* <: js.Object */, T](component: col, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[col], 
      Exclude[/* keyof react.react.ComponentProps<'col'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_colgroup[P /* <: js.Object */, T](component: colgroup, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[colgroup], 
      Exclude[/* keyof react.react.ComponentProps<'colgroup'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_colgroup[P /* <: js.Object */, T](component: colgroup, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[colgroup], 
      Exclude[/* keyof react.react.ComponentProps<'colgroup'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_data[P /* <: js.Object */, T](component: data, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[data], 
      Exclude[/* keyof react.react.ComponentProps<'data'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_data[P /* <: js.Object */, T](component: data, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[data], 
      Exclude[/* keyof react.react.ComponentProps<'data'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_datalist[P /* <: js.Object */, T](component: datalist, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[datalist], 
      Exclude[/* keyof react.react.ComponentProps<'datalist'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_datalist[P /* <: js.Object */, T](component: datalist, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[datalist], 
      Exclude[/* keyof react.react.ComponentProps<'datalist'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_dd[P /* <: js.Object */, T](component: dd, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[dd], 
      Exclude[/* keyof react.react.ComponentProps<'dd'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_dd[P /* <: js.Object */, T](component: dd, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[dd], 
      Exclude[/* keyof react.react.ComponentProps<'dd'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_defs[P /* <: js.Object */, T](component: defs, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[defs], 
      Exclude[/* keyof react.react.ComponentProps<'defs'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_defs[P /* <: js.Object */, T](component: defs, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[defs], 
      Exclude[/* keyof react.react.ComponentProps<'defs'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_del[P /* <: js.Object */, T](component: del, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[del], 
      Exclude[/* keyof react.react.ComponentProps<'del'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_del[P /* <: js.Object */, T](component: del, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[del], 
      Exclude[/* keyof react.react.ComponentProps<'del'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_desc[P /* <: js.Object */, T](component: desc_, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[desc_], 
      Exclude[/* keyof react.react.ComponentProps<'desc'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_desc[P /* <: js.Object */, T](component: desc_, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[desc_], 
      Exclude[/* keyof react.react.ComponentProps<'desc'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_details[P /* <: js.Object */, T](component: details, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[details], 
      Exclude[/* keyof react.react.ComponentProps<'details'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_details[P /* <: js.Object */, T](component: details, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[details], 
      Exclude[/* keyof react.react.ComponentProps<'details'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_dfn[P /* <: js.Object */, T](component: dfn, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[dfn], 
      Exclude[/* keyof react.react.ComponentProps<'dfn'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_dfn[P /* <: js.Object */, T](component: dfn, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[dfn], 
      Exclude[/* keyof react.react.ComponentProps<'dfn'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_dialog[P /* <: js.Object */, T](component: dialog, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[dialog], 
      Exclude[/* keyof react.react.ComponentProps<'dialog'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_dialog[P /* <: js.Object */, T](component: dialog, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[dialog], 
      Exclude[/* keyof react.react.ComponentProps<'dialog'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_div[P /* <: js.Object */, T](component: div, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[div], 
      Exclude[/* keyof react.react.ComponentProps<'div'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_div[P /* <: js.Object */, T](component: div, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[div], 
      Exclude[/* keyof react.react.ComponentProps<'div'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_dl[P /* <: js.Object */, T](component: dl, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[dl], 
      Exclude[/* keyof react.react.ComponentProps<'dl'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_dl[P /* <: js.Object */, T](component: dl, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[dl], 
      Exclude[/* keyof react.react.ComponentProps<'dl'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_dt[P /* <: js.Object */, T](component: dt, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[dt], 
      Exclude[/* keyof react.react.ComponentProps<'dt'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_dt[P /* <: js.Object */, T](component: dt, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[dt], 
      Exclude[/* keyof react.react.ComponentProps<'dt'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_ellipse[P /* <: js.Object */, T](component: ellipse, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[ellipse], 
      Exclude[/* keyof react.react.ComponentProps<'ellipse'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_ellipse[P /* <: js.Object */, T](component: ellipse, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[ellipse], 
      Exclude[/* keyof react.react.ComponentProps<'ellipse'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_em[P /* <: js.Object */, T](component: em, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[em], 
      Exclude[/* keyof react.react.ComponentProps<'em'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_em[P /* <: js.Object */, T](component: em, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[em], 
      Exclude[/* keyof react.react.ComponentProps<'em'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_embed[P /* <: js.Object */, T](component: embed, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[embed], 
      Exclude[/* keyof react.react.ComponentProps<'embed'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_embed[P /* <: js.Object */, T](component: embed, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[embed], 
      Exclude[/* keyof react.react.ComponentProps<'embed'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feBlend[P /* <: js.Object */, T](component: feBlend, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feBlend], 
      Exclude[/* keyof react.react.ComponentProps<'feBlend'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feBlend[P /* <: js.Object */, T](component: feBlend, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feBlend], 
      Exclude[/* keyof react.react.ComponentProps<'feBlend'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feColorMatrix[P /* <: js.Object */, T](component: feColorMatrix, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feColorMatrix], 
      Exclude[/* keyof react.react.ComponentProps<'feColorMatrix'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feColorMatrix[P /* <: js.Object */, T](component: feColorMatrix, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feColorMatrix], 
      Exclude[/* keyof react.react.ComponentProps<'feColorMatrix'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feComponentTransfer[P /* <: js.Object */, T](component: feComponentTransfer, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feComponentTransfer], 
      Exclude[/* keyof react.react.ComponentProps<'feComponentTransfer'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feComponentTransfer[P /* <: js.Object */, T](component: feComponentTransfer, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feComponentTransfer], 
      Exclude[/* keyof react.react.ComponentProps<'feComponentTransfer'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feComposite[P /* <: js.Object */, T](component: feComposite, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feComposite], 
      Exclude[/* keyof react.react.ComponentProps<'feComposite'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feComposite[P /* <: js.Object */, T](component: feComposite, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feComposite], 
      Exclude[/* keyof react.react.ComponentProps<'feComposite'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feConvolveMatrix[P /* <: js.Object */, T](component: feConvolveMatrix, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feConvolveMatrix], 
      Exclude[/* keyof react.react.ComponentProps<'feConvolveMatrix'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feConvolveMatrix[P /* <: js.Object */, T](component: feConvolveMatrix, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feConvolveMatrix], 
      Exclude[/* keyof react.react.ComponentProps<'feConvolveMatrix'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feDiffuseLighting[P /* <: js.Object */, T](component: feDiffuseLighting, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feDiffuseLighting], 
      Exclude[/* keyof react.react.ComponentProps<'feDiffuseLighting'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feDiffuseLighting[P /* <: js.Object */, T](component: feDiffuseLighting, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feDiffuseLighting], 
      Exclude[/* keyof react.react.ComponentProps<'feDiffuseLighting'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feDisplacementMap[P /* <: js.Object */, T](component: feDisplacementMap, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feDisplacementMap], 
      Exclude[/* keyof react.react.ComponentProps<'feDisplacementMap'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feDisplacementMap[P /* <: js.Object */, T](component: feDisplacementMap, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feDisplacementMap], 
      Exclude[/* keyof react.react.ComponentProps<'feDisplacementMap'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feDistantLight[P /* <: js.Object */, T](component: feDistantLight, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feDistantLight], 
      Exclude[/* keyof react.react.ComponentProps<'feDistantLight'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feDistantLight[P /* <: js.Object */, T](component: feDistantLight, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feDistantLight], 
      Exclude[/* keyof react.react.ComponentProps<'feDistantLight'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feDropShadow[P /* <: js.Object */, T](component: feDropShadow, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feDropShadow], 
      Exclude[/* keyof react.react.ComponentProps<'feDropShadow'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feDropShadow[P /* <: js.Object */, T](component: feDropShadow, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feDropShadow], 
      Exclude[/* keyof react.react.ComponentProps<'feDropShadow'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feFlood[P /* <: js.Object */, T](component: feFlood, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feFlood], 
      Exclude[/* keyof react.react.ComponentProps<'feFlood'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feFlood[P /* <: js.Object */, T](component: feFlood, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feFlood], 
      Exclude[/* keyof react.react.ComponentProps<'feFlood'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feFuncA[P /* <: js.Object */, T](component: feFuncA, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feFuncA], 
      Exclude[/* keyof react.react.ComponentProps<'feFuncA'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feFuncA[P /* <: js.Object */, T](component: feFuncA, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feFuncA], 
      Exclude[/* keyof react.react.ComponentProps<'feFuncA'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feFuncB[P /* <: js.Object */, T](component: feFuncB, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feFuncB], 
      Exclude[/* keyof react.react.ComponentProps<'feFuncB'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feFuncB[P /* <: js.Object */, T](component: feFuncB, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feFuncB], 
      Exclude[/* keyof react.react.ComponentProps<'feFuncB'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feFuncG[P /* <: js.Object */, T](component: feFuncG, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feFuncG], 
      Exclude[/* keyof react.react.ComponentProps<'feFuncG'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feFuncG[P /* <: js.Object */, T](component: feFuncG, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feFuncG], 
      Exclude[/* keyof react.react.ComponentProps<'feFuncG'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feFuncR[P /* <: js.Object */, T](component: feFuncR, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feFuncR], 
      Exclude[/* keyof react.react.ComponentProps<'feFuncR'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feFuncR[P /* <: js.Object */, T](component: feFuncR, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feFuncR], 
      Exclude[/* keyof react.react.ComponentProps<'feFuncR'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feGaussianBlur[P /* <: js.Object */, T](component: feGaussianBlur, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feGaussianBlur], 
      Exclude[/* keyof react.react.ComponentProps<'feGaussianBlur'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feGaussianBlur[P /* <: js.Object */, T](component: feGaussianBlur, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feGaussianBlur], 
      Exclude[/* keyof react.react.ComponentProps<'feGaussianBlur'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feImage[P /* <: js.Object */, T](component: feImage, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feImage], 
      Exclude[/* keyof react.react.ComponentProps<'feImage'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feImage[P /* <: js.Object */, T](component: feImage, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feImage], 
      Exclude[/* keyof react.react.ComponentProps<'feImage'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feMerge[P /* <: js.Object */, T](component: feMerge, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feMerge], 
      Exclude[/* keyof react.react.ComponentProps<'feMerge'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feMerge[P /* <: js.Object */, T](component: feMerge, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feMerge], 
      Exclude[/* keyof react.react.ComponentProps<'feMerge'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feMergeNode[P /* <: js.Object */, T](component: feMergeNode, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feMergeNode], 
      Exclude[/* keyof react.react.ComponentProps<'feMergeNode'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feMergeNode[P /* <: js.Object */, T](component: feMergeNode, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feMergeNode], 
      Exclude[/* keyof react.react.ComponentProps<'feMergeNode'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feMorphology[P /* <: js.Object */, T](component: feMorphology, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feMorphology], 
      Exclude[/* keyof react.react.ComponentProps<'feMorphology'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feMorphology[P /* <: js.Object */, T](component: feMorphology, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feMorphology], 
      Exclude[/* keyof react.react.ComponentProps<'feMorphology'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feOffset[P /* <: js.Object */, T](component: feOffset, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feOffset], 
      Exclude[/* keyof react.react.ComponentProps<'feOffset'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feOffset[P /* <: js.Object */, T](component: feOffset, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feOffset], 
      Exclude[/* keyof react.react.ComponentProps<'feOffset'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_fePointLight[P /* <: js.Object */, T](component: fePointLight, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[fePointLight], 
      Exclude[/* keyof react.react.ComponentProps<'fePointLight'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_fePointLight[P /* <: js.Object */, T](component: fePointLight, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[fePointLight], 
      Exclude[/* keyof react.react.ComponentProps<'fePointLight'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feSpecularLighting[P /* <: js.Object */, T](component: feSpecularLighting, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feSpecularLighting], 
      Exclude[/* keyof react.react.ComponentProps<'feSpecularLighting'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feSpecularLighting[P /* <: js.Object */, T](component: feSpecularLighting, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feSpecularLighting], 
      Exclude[/* keyof react.react.ComponentProps<'feSpecularLighting'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feSpotLight[P /* <: js.Object */, T](component: feSpotLight, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feSpotLight], 
      Exclude[/* keyof react.react.ComponentProps<'feSpotLight'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feSpotLight[P /* <: js.Object */, T](component: feSpotLight, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feSpotLight], 
      Exclude[/* keyof react.react.ComponentProps<'feSpotLight'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feTile[P /* <: js.Object */, T](component: feTile, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feTile], 
      Exclude[/* keyof react.react.ComponentProps<'feTile'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feTile[P /* <: js.Object */, T](component: feTile, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feTile], 
      Exclude[/* keyof react.react.ComponentProps<'feTile'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feTurbulence[P /* <: js.Object */, T](component: feTurbulence, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[feTurbulence], 
      Exclude[/* keyof react.react.ComponentProps<'feTurbulence'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_feTurbulence[P /* <: js.Object */, T](component: feTurbulence, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[feTurbulence], 
      Exclude[/* keyof react.react.ComponentProps<'feTurbulence'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_fieldset[P /* <: js.Object */, T](component: fieldset, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[fieldset], 
      Exclude[/* keyof react.react.ComponentProps<'fieldset'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_fieldset[P /* <: js.Object */, T](component: fieldset, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[fieldset], 
      Exclude[/* keyof react.react.ComponentProps<'fieldset'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_figcaption[P /* <: js.Object */, T](component: figcaption, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[figcaption], 
      Exclude[/* keyof react.react.ComponentProps<'figcaption'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_figcaption[P /* <: js.Object */, T](component: figcaption, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[figcaption], 
      Exclude[/* keyof react.react.ComponentProps<'figcaption'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_figure[P /* <: js.Object */, T](component: figure, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[figure], 
      Exclude[/* keyof react.react.ComponentProps<'figure'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_figure[P /* <: js.Object */, T](component: figure, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[figure], 
      Exclude[/* keyof react.react.ComponentProps<'figure'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_filter[P /* <: js.Object */, T](component: filter, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[filter], 
      Exclude[/* keyof react.react.ComponentProps<'filter'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_filter[P /* <: js.Object */, T](component: filter, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[filter], 
      Exclude[/* keyof react.react.ComponentProps<'filter'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_footer[P /* <: js.Object */, T](component: footer, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[footer], 
      Exclude[/* keyof react.react.ComponentProps<'footer'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_footer[P /* <: js.Object */, T](component: footer, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[footer], 
      Exclude[/* keyof react.react.ComponentProps<'footer'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_foreignObject[P /* <: js.Object */, T](component: foreignObject, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[foreignObject], 
      Exclude[/* keyof react.react.ComponentProps<'foreignObject'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_foreignObject[P /* <: js.Object */, T](component: foreignObject, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[foreignObject], 
      Exclude[/* keyof react.react.ComponentProps<'foreignObject'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_form[P /* <: js.Object */, T](component: form, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[form], 
      Exclude[/* keyof react.react.ComponentProps<'form'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_form[P /* <: js.Object */, T](component: form, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[form], 
      Exclude[/* keyof react.react.ComponentProps<'form'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_g[P /* <: js.Object */, T](component: g, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[g], 
      Exclude[/* keyof react.react.ComponentProps<'g'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_g[P /* <: js.Object */, T](component: g, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[g], 
      Exclude[/* keyof react.react.ComponentProps<'g'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_h1[P /* <: js.Object */, T](component: h1, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[h1], 
      Exclude[/* keyof react.react.ComponentProps<'h1'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_h1[P /* <: js.Object */, T](component: h1, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[h1], 
      Exclude[/* keyof react.react.ComponentProps<'h1'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_h2[P /* <: js.Object */, T](component: h2, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[h2], 
      Exclude[/* keyof react.react.ComponentProps<'h2'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_h2[P /* <: js.Object */, T](component: h2, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[h2], 
      Exclude[/* keyof react.react.ComponentProps<'h2'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_h3[P /* <: js.Object */, T](component: h3, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[h3], 
      Exclude[/* keyof react.react.ComponentProps<'h3'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_h3[P /* <: js.Object */, T](component: h3, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[h3], 
      Exclude[/* keyof react.react.ComponentProps<'h3'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_h4[P /* <: js.Object */, T](component: h4, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[h4], 
      Exclude[/* keyof react.react.ComponentProps<'h4'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_h4[P /* <: js.Object */, T](component: h4, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[h4], 
      Exclude[/* keyof react.react.ComponentProps<'h4'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_h5[P /* <: js.Object */, T](component: h5, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[h5], 
      Exclude[/* keyof react.react.ComponentProps<'h5'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_h5[P /* <: js.Object */, T](component: h5, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[h5], 
      Exclude[/* keyof react.react.ComponentProps<'h5'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_h6[P /* <: js.Object */, T](component: h6, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[h6], 
      Exclude[/* keyof react.react.ComponentProps<'h6'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_h6[P /* <: js.Object */, T](component: h6, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[h6], 
      Exclude[/* keyof react.react.ComponentProps<'h6'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_head[P /* <: js.Object */, T](component: head, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[head], 
      Exclude[/* keyof react.react.ComponentProps<'head'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_head[P /* <: js.Object */, T](component: head, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[head], 
      Exclude[/* keyof react.react.ComponentProps<'head'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_header[P /* <: js.Object */, T](component: header, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[header], 
      Exclude[/* keyof react.react.ComponentProps<'header'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_header[P /* <: js.Object */, T](component: header, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[header], 
      Exclude[/* keyof react.react.ComponentProps<'header'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_hgroup[P /* <: js.Object */, T](component: hgroup, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[hgroup], 
      Exclude[/* keyof react.react.ComponentProps<'hgroup'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_hgroup[P /* <: js.Object */, T](component: hgroup, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[hgroup], 
      Exclude[/* keyof react.react.ComponentProps<'hgroup'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_hr[P /* <: js.Object */, T](component: hr_, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[hr_], 
      Exclude[/* keyof react.react.ComponentProps<'hr'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_hr[P /* <: js.Object */, T](component: hr_, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[hr_], 
      Exclude[/* keyof react.react.ComponentProps<'hr'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_html[P /* <: js.Object */, T](component: html, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[html], 
      Exclude[/* keyof react.react.ComponentProps<'html'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_html[P /* <: js.Object */, T](component: html, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[html], 
      Exclude[/* keyof react.react.ComponentProps<'html'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_i[P /* <: js.Object */, T](component: i, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[i], 
      Exclude[/* keyof react.react.ComponentProps<'i'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_i[P /* <: js.Object */, T](component: i, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[i], 
      Exclude[/* keyof react.react.ComponentProps<'i'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_iframe[P /* <: js.Object */, T](component: iframe, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[iframe], 
      Exclude[/* keyof react.react.ComponentProps<'iframe'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_iframe[P /* <: js.Object */, T](component: iframe, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[iframe], 
      Exclude[/* keyof react.react.ComponentProps<'iframe'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_image[P /* <: js.Object */, T](component: image, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[image], 
      Exclude[/* keyof react.react.ComponentProps<'image'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_image[P /* <: js.Object */, T](component: image, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[image], 
      Exclude[/* keyof react.react.ComponentProps<'image'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_img[P /* <: js.Object */, T](component: img, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[img], 
      Exclude[/* keyof react.react.ComponentProps<'img'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_img[P /* <: js.Object */, T](component: img, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[img], 
      Exclude[/* keyof react.react.ComponentProps<'img'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_input[P /* <: js.Object */, T](component: input, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[input], 
      Exclude[/* keyof react.react.ComponentProps<'input'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_input[P /* <: js.Object */, T](component: input, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[input], 
      Exclude[/* keyof react.react.ComponentProps<'input'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_ins[P /* <: js.Object */, T](component: ins, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[ins], 
      Exclude[/* keyof react.react.ComponentProps<'ins'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_ins[P /* <: js.Object */, T](component: ins, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[ins], 
      Exclude[/* keyof react.react.ComponentProps<'ins'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_kbd[P /* <: js.Object */, T](component: kbd, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[kbd], 
      Exclude[/* keyof react.react.ComponentProps<'kbd'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_kbd[P /* <: js.Object */, T](component: kbd, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[kbd], 
      Exclude[/* keyof react.react.ComponentProps<'kbd'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_keygen[P /* <: js.Object */, T](component: keygen, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[keygen], 
      Exclude[/* keyof react.react.ComponentProps<'keygen'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_keygen[P /* <: js.Object */, T](component: keygen, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[keygen], 
      Exclude[/* keyof react.react.ComponentProps<'keygen'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_label[P /* <: js.Object */, T](component: label, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[label], 
      Exclude[/* keyof react.react.ComponentProps<'label'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_label[P /* <: js.Object */, T](component: label, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[label], 
      Exclude[/* keyof react.react.ComponentProps<'label'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_legend[P /* <: js.Object */, T](component: legend, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[legend], 
      Exclude[/* keyof react.react.ComponentProps<'legend'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_legend[P /* <: js.Object */, T](component: legend, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[legend], 
      Exclude[/* keyof react.react.ComponentProps<'legend'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_li[P /* <: js.Object */, T](component: li_, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[li_], 
      Exclude[/* keyof react.react.ComponentProps<'li'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_li[P /* <: js.Object */, T](component: li_, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[li_], 
      Exclude[/* keyof react.react.ComponentProps<'li'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_line[P /* <: js.Object */, T](component: line, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[line], 
      Exclude[/* keyof react.react.ComponentProps<'line'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_line[P /* <: js.Object */, T](component: line, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[line], 
      Exclude[/* keyof react.react.ComponentProps<'line'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_linearGradient[P /* <: js.Object */, T](component: linearGradient, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[linearGradient], 
      Exclude[/* keyof react.react.ComponentProps<'linearGradient'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_linearGradient[P /* <: js.Object */, T](component: linearGradient, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[linearGradient], 
      Exclude[/* keyof react.react.ComponentProps<'linearGradient'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_link[P /* <: js.Object */, T](component: link, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[link], 
      Exclude[/* keyof react.react.ComponentProps<'link'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_link[P /* <: js.Object */, T](component: link, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[link], 
      Exclude[/* keyof react.react.ComponentProps<'link'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_main[P /* <: js.Object */, T](component: main, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[main], 
      Exclude[/* keyof react.react.ComponentProps<'main'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_main[P /* <: js.Object */, T](component: main, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[main], 
      Exclude[/* keyof react.react.ComponentProps<'main'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_map[P /* <: js.Object */, T](component: map, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[map], 
      Exclude[/* keyof react.react.ComponentProps<'map'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_map[P /* <: js.Object */, T](component: map, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[map], 
      Exclude[/* keyof react.react.ComponentProps<'map'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_mark[P /* <: js.Object */, T](component: mark, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[mark], 
      Exclude[/* keyof react.react.ComponentProps<'mark'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_mark[P /* <: js.Object */, T](component: mark, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[mark], 
      Exclude[/* keyof react.react.ComponentProps<'mark'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_marker[P /* <: js.Object */, T](component: marker, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[marker], 
      Exclude[/* keyof react.react.ComponentProps<'marker'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_marker[P /* <: js.Object */, T](component: marker, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[marker], 
      Exclude[/* keyof react.react.ComponentProps<'marker'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_mask[P /* <: js.Object */, T](component: mask, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[mask], 
      Exclude[/* keyof react.react.ComponentProps<'mask'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_mask[P /* <: js.Object */, T](component: mask, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[mask], 
      Exclude[/* keyof react.react.ComponentProps<'mask'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_menu[P /* <: js.Object */, T](component: menu, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[menu], 
      Exclude[/* keyof react.react.ComponentProps<'menu'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_menu[P /* <: js.Object */, T](component: menu, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[menu], 
      Exclude[/* keyof react.react.ComponentProps<'menu'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_menuitem[P /* <: js.Object */, T](component: menuitem, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[menuitem], 
      Exclude[/* keyof react.react.ComponentProps<'menuitem'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_menuitem[P /* <: js.Object */, T](component: menuitem, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[menuitem], 
      Exclude[/* keyof react.react.ComponentProps<'menuitem'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_meta[P /* <: js.Object */, T](component: meta, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[meta], 
      Exclude[/* keyof react.react.ComponentProps<'meta'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_meta[P /* <: js.Object */, T](component: meta, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[meta], 
      Exclude[/* keyof react.react.ComponentProps<'meta'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_metadata[P /* <: js.Object */, T](component: metadata, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[metadata], 
      Exclude[/* keyof react.react.ComponentProps<'metadata'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_metadata[P /* <: js.Object */, T](component: metadata, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[metadata], 
      Exclude[/* keyof react.react.ComponentProps<'metadata'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_meter[P /* <: js.Object */, T](component: meter, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[meter], 
      Exclude[/* keyof react.react.ComponentProps<'meter'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_meter[P /* <: js.Object */, T](component: meter, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[meter], 
      Exclude[/* keyof react.react.ComponentProps<'meter'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_mpath[P /* <: js.Object */, T](component: mpath, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[mpath], 
      Exclude[/* keyof react.react.ComponentProps<'mpath'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_mpath[P /* <: js.Object */, T](component: mpath, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[mpath], 
      Exclude[/* keyof react.react.ComponentProps<'mpath'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_nav[P /* <: js.Object */, T](component: nav, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[nav], 
      Exclude[/* keyof react.react.ComponentProps<'nav'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_nav[P /* <: js.Object */, T](component: nav, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[nav], 
      Exclude[/* keyof react.react.ComponentProps<'nav'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_noindex[P /* <: js.Object */, T](component: noindex, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[noindex], 
      Exclude[/* keyof react.react.ComponentProps<'noindex'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_noindex[P /* <: js.Object */, T](component: noindex, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[noindex], 
      Exclude[/* keyof react.react.ComponentProps<'noindex'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_noscript[P /* <: js.Object */, T](component: noscript, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[noscript], 
      Exclude[/* keyof react.react.ComponentProps<'noscript'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_noscript[P /* <: js.Object */, T](component: noscript, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[noscript], 
      Exclude[/* keyof react.react.ComponentProps<'noscript'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_object[P /* <: js.Object */, T](component: `object`, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[`object`], 
      Exclude[/* keyof react.react.ComponentProps<'object'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_object[P /* <: js.Object */, T](component: `object`, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[`object`], 
      Exclude[/* keyof react.react.ComponentProps<'object'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_ol[P /* <: js.Object */, T](component: ol, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[ol], 
      Exclude[/* keyof react.react.ComponentProps<'ol'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_ol[P /* <: js.Object */, T](component: ol, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[ol], 
      Exclude[/* keyof react.react.ComponentProps<'ol'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_optgroup[P /* <: js.Object */, T](component: optgroup, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[optgroup], 
      Exclude[/* keyof react.react.ComponentProps<'optgroup'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_optgroup[P /* <: js.Object */, T](component: optgroup, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[optgroup], 
      Exclude[/* keyof react.react.ComponentProps<'optgroup'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_option[P /* <: js.Object */, T](component: option, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[option], 
      Exclude[/* keyof react.react.ComponentProps<'option'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_option[P /* <: js.Object */, T](component: option, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[option], 
      Exclude[/* keyof react.react.ComponentProps<'option'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_output[P /* <: js.Object */, T](component: output, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[output], 
      Exclude[/* keyof react.react.ComponentProps<'output'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_output[P /* <: js.Object */, T](component: output, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[output], 
      Exclude[/* keyof react.react.ComponentProps<'output'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_p[P /* <: js.Object */, T](component: p, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[p], 
      Exclude[/* keyof react.react.ComponentProps<'p'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_p[P /* <: js.Object */, T](component: p, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[p], 
      Exclude[/* keyof react.react.ComponentProps<'p'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_param[P /* <: js.Object */, T](component: param, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[param], 
      Exclude[/* keyof react.react.ComponentProps<'param'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_param[P /* <: js.Object */, T](component: param, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[param], 
      Exclude[/* keyof react.react.ComponentProps<'param'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_path[P /* <: js.Object */, T](component: path, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[path], 
      Exclude[/* keyof react.react.ComponentProps<'path'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_path[P /* <: js.Object */, T](component: path, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[path], 
      Exclude[/* keyof react.react.ComponentProps<'path'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_pattern[P /* <: js.Object */, T](component: pattern, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[pattern], 
      Exclude[/* keyof react.react.ComponentProps<'pattern'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_pattern[P /* <: js.Object */, T](component: pattern, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[pattern], 
      Exclude[/* keyof react.react.ComponentProps<'pattern'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_picture[P /* <: js.Object */, T](component: picture, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[picture], 
      Exclude[/* keyof react.react.ComponentProps<'picture'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_picture[P /* <: js.Object */, T](component: picture, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[picture], 
      Exclude[/* keyof react.react.ComponentProps<'picture'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_polygon[P /* <: js.Object */, T](component: polygon, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[polygon], 
      Exclude[/* keyof react.react.ComponentProps<'polygon'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_polygon[P /* <: js.Object */, T](component: polygon, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[polygon], 
      Exclude[/* keyof react.react.ComponentProps<'polygon'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_polyline[P /* <: js.Object */, T](component: polyline, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[polyline], 
      Exclude[/* keyof react.react.ComponentProps<'polyline'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_polyline[P /* <: js.Object */, T](component: polyline, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[polyline], 
      Exclude[/* keyof react.react.ComponentProps<'polyline'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_pre[P /* <: js.Object */, T](component: pre, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[pre], 
      Exclude[/* keyof react.react.ComponentProps<'pre'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_pre[P /* <: js.Object */, T](component: pre, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[pre], 
      Exclude[/* keyof react.react.ComponentProps<'pre'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_progress[P /* <: js.Object */, T](component: progress, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[progress], 
      Exclude[/* keyof react.react.ComponentProps<'progress'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_progress[P /* <: js.Object */, T](component: progress, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[progress], 
      Exclude[/* keyof react.react.ComponentProps<'progress'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_q[P /* <: js.Object */, T](component: q, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[q], 
      Exclude[/* keyof react.react.ComponentProps<'q'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_q[P /* <: js.Object */, T](component: q, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[q], 
      Exclude[/* keyof react.react.ComponentProps<'q'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_radialGradient[P /* <: js.Object */, T](component: radialGradient, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[radialGradient], 
      Exclude[/* keyof react.react.ComponentProps<'radialGradient'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_radialGradient[P /* <: js.Object */, T](component: radialGradient, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[radialGradient], 
      Exclude[/* keyof react.react.ComponentProps<'radialGradient'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_rect[P /* <: js.Object */, T](component: rect, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[rect], 
      Exclude[/* keyof react.react.ComponentProps<'rect'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_rect[P /* <: js.Object */, T](component: rect, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[rect], 
      Exclude[/* keyof react.react.ComponentProps<'rect'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_rp[P /* <: js.Object */, T](component: rp, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[rp], 
      Exclude[/* keyof react.react.ComponentProps<'rp'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_rp[P /* <: js.Object */, T](component: rp, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[rp], 
      Exclude[/* keyof react.react.ComponentProps<'rp'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_rt[P /* <: js.Object */, T](component: rt, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[rt], 
      Exclude[/* keyof react.react.ComponentProps<'rt'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_rt[P /* <: js.Object */, T](component: rt, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[rt], 
      Exclude[/* keyof react.react.ComponentProps<'rt'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_ruby[P /* <: js.Object */, T](component: ruby, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[ruby], 
      Exclude[/* keyof react.react.ComponentProps<'ruby'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_ruby[P /* <: js.Object */, T](component: ruby, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[ruby], 
      Exclude[/* keyof react.react.ComponentProps<'ruby'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_s[P /* <: js.Object */, T](component: s, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[s], 
      Exclude[/* keyof react.react.ComponentProps<'s'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_s[P /* <: js.Object */, T](component: s, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[s], 
      Exclude[/* keyof react.react.ComponentProps<'s'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_samp[P /* <: js.Object */, T](component: samp, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[samp], 
      Exclude[/* keyof react.react.ComponentProps<'samp'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_samp[P /* <: js.Object */, T](component: samp, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[samp], 
      Exclude[/* keyof react.react.ComponentProps<'samp'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_script[P /* <: js.Object */, T](component: script, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[script], 
      Exclude[/* keyof react.react.ComponentProps<'script'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_script[P /* <: js.Object */, T](component: script, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[script], 
      Exclude[/* keyof react.react.ComponentProps<'script'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_section[P /* <: js.Object */, T](component: section, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[section], 
      Exclude[/* keyof react.react.ComponentProps<'section'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_section[P /* <: js.Object */, T](component: section, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[section], 
      Exclude[/* keyof react.react.ComponentProps<'section'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_select[P /* <: js.Object */, T](component: select, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[select], 
      Exclude[/* keyof react.react.ComponentProps<'select'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_select[P /* <: js.Object */, T](component: select, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[select], 
      Exclude[/* keyof react.react.ComponentProps<'select'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_slot[P /* <: js.Object */, T](component: slot, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[slot], 
      Exclude[/* keyof react.react.ComponentProps<'slot'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_slot[P /* <: js.Object */, T](component: slot, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[slot], 
      Exclude[/* keyof react.react.ComponentProps<'slot'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_small[P /* <: js.Object */, T](component: small_, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[small_], 
      Exclude[/* keyof react.react.ComponentProps<'small'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_small[P /* <: js.Object */, T](component: small_, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[small_], 
      Exclude[/* keyof react.react.ComponentProps<'small'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_source[P /* <: js.Object */, T](component: source, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[source], 
      Exclude[/* keyof react.react.ComponentProps<'source'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_source[P /* <: js.Object */, T](component: source, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[source], 
      Exclude[/* keyof react.react.ComponentProps<'source'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_span[P /* <: js.Object */, T](component: span, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[span], 
      Exclude[/* keyof react.react.ComponentProps<'span'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_span[P /* <: js.Object */, T](component: span, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[span], 
      Exclude[/* keyof react.react.ComponentProps<'span'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_stop[P /* <: js.Object */, T](component: stop, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[stop], 
      Exclude[/* keyof react.react.ComponentProps<'stop'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_stop[P /* <: js.Object */, T](component: stop, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[stop], 
      Exclude[/* keyof react.react.ComponentProps<'stop'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_strong[P /* <: js.Object */, T](component: strong, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[strong], 
      Exclude[/* keyof react.react.ComponentProps<'strong'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_strong[P /* <: js.Object */, T](component: strong, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[strong], 
      Exclude[/* keyof react.react.ComponentProps<'strong'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_style[P /* <: js.Object */, T](component: style, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[style], 
      Exclude[/* keyof react.react.ComponentProps<'style'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_style[P /* <: js.Object */, T](component: style, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[style], 
      Exclude[/* keyof react.react.ComponentProps<'style'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_sub[P /* <: js.Object */, T](component: sub, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[sub], 
      Exclude[/* keyof react.react.ComponentProps<'sub'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_sub[P /* <: js.Object */, T](component: sub, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[sub], 
      Exclude[/* keyof react.react.ComponentProps<'sub'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_summary[P /* <: js.Object */, T](component: summary, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[summary], 
      Exclude[/* keyof react.react.ComponentProps<'summary'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_summary[P /* <: js.Object */, T](component: summary, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[summary], 
      Exclude[/* keyof react.react.ComponentProps<'summary'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_sup[P /* <: js.Object */, T](component: sup, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[sup], 
      Exclude[/* keyof react.react.ComponentProps<'sup'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_sup[P /* <: js.Object */, T](component: sup, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[sup], 
      Exclude[/* keyof react.react.ComponentProps<'sup'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_svg[P /* <: js.Object */, T](component: svg, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[svg], 
      Exclude[/* keyof react.react.ComponentProps<'svg'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_svg[P /* <: js.Object */, T](component: svg, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[svg], 
      Exclude[/* keyof react.react.ComponentProps<'svg'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_switch[P /* <: js.Object */, T](component: switch, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[switch], 
      Exclude[/* keyof react.react.ComponentProps<'switch'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_switch[P /* <: js.Object */, T](component: switch, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[switch], 
      Exclude[/* keyof react.react.ComponentProps<'switch'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_symbol[P /* <: js.Object */, T](component: symbol, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[symbol], 
      Exclude[/* keyof react.react.ComponentProps<'symbol'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_symbol[P /* <: js.Object */, T](component: symbol, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[symbol], 
      Exclude[/* keyof react.react.ComponentProps<'symbol'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_table[P /* <: js.Object */, T](component: table, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[table], 
      Exclude[/* keyof react.react.ComponentProps<'table'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_table[P /* <: js.Object */, T](component: table, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[table], 
      Exclude[/* keyof react.react.ComponentProps<'table'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_tbody[P /* <: js.Object */, T](component: tbody, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[tbody], 
      Exclude[/* keyof react.react.ComponentProps<'tbody'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_tbody[P /* <: js.Object */, T](component: tbody, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[tbody], 
      Exclude[/* keyof react.react.ComponentProps<'tbody'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_td[P /* <: js.Object */, T](component: td_, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[td_], 
      Exclude[/* keyof react.react.ComponentProps<'td'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_td[P /* <: js.Object */, T](component: td_, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[td_], 
      Exclude[/* keyof react.react.ComponentProps<'td'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_template[P /* <: js.Object */, T](component: template, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[template], 
      Exclude[/* keyof react.react.ComponentProps<'template'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_template[P /* <: js.Object */, T](component: template, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[template], 
      Exclude[/* keyof react.react.ComponentProps<'template'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_text[P /* <: js.Object */, T](component: text, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[text], 
      Exclude[/* keyof react.react.ComponentProps<'text'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_text[P /* <: js.Object */, T](component: text, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[text], 
      Exclude[/* keyof react.react.ComponentProps<'text'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_textPath[P /* <: js.Object */, T](component: textPath, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[textPath], 
      Exclude[/* keyof react.react.ComponentProps<'textPath'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_textPath[P /* <: js.Object */, T](component: textPath, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[textPath], 
      Exclude[/* keyof react.react.ComponentProps<'textPath'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_textarea[P /* <: js.Object */, T](component: textarea, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[textarea], 
      Exclude[/* keyof react.react.ComponentProps<'textarea'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_textarea[P /* <: js.Object */, T](component: textarea, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[textarea], 
      Exclude[/* keyof react.react.ComponentProps<'textarea'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_tfoot[P /* <: js.Object */, T](component: tfoot, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[tfoot], 
      Exclude[/* keyof react.react.ComponentProps<'tfoot'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_tfoot[P /* <: js.Object */, T](component: tfoot, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[tfoot], 
      Exclude[/* keyof react.react.ComponentProps<'tfoot'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_th[P /* <: js.Object */, T](component: th_, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[th_], 
      Exclude[/* keyof react.react.ComponentProps<'th'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_th[P /* <: js.Object */, T](component: th_, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[th_], 
      Exclude[/* keyof react.react.ComponentProps<'th'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_thead[P /* <: js.Object */, T](component: thead, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[thead], 
      Exclude[/* keyof react.react.ComponentProps<'thead'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_thead[P /* <: js.Object */, T](component: thead, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[thead], 
      Exclude[/* keyof react.react.ComponentProps<'thead'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_time[P /* <: js.Object */, T](component: time, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[time], 
      Exclude[/* keyof react.react.ComponentProps<'time'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_time[P /* <: js.Object */, T](component: time, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[time], 
      Exclude[/* keyof react.react.ComponentProps<'time'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_title[P /* <: js.Object */, T](component: title, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[title], 
      Exclude[/* keyof react.react.ComponentProps<'title'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_title[P /* <: js.Object */, T](component: title, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[title], 
      Exclude[/* keyof react.react.ComponentProps<'title'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_tr[P /* <: js.Object */, T](component: tr_, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[tr_], 
      Exclude[/* keyof react.react.ComponentProps<'tr'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_tr[P /* <: js.Object */, T](component: tr_, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[tr_], 
      Exclude[/* keyof react.react.ComponentProps<'tr'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_track[P /* <: js.Object */, T](component: track, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[track], 
      Exclude[/* keyof react.react.ComponentProps<'track'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_track[P /* <: js.Object */, T](component: track, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[track], 
      Exclude[/* keyof react.react.ComponentProps<'track'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_tspan[P /* <: js.Object */, T](component: tspan, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[tspan], 
      Exclude[/* keyof react.react.ComponentProps<'tspan'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_tspan[P /* <: js.Object */, T](component: tspan, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[tspan], 
      Exclude[/* keyof react.react.ComponentProps<'tspan'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_u[P /* <: js.Object */, T](component: u, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[u], 
      Exclude[/* keyof react.react.ComponentProps<'u'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_u[P /* <: js.Object */, T](component: u, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[u], 
      Exclude[/* keyof react.react.ComponentProps<'u'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_ul[P /* <: js.Object */, T](component: ul, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[ul], 
      Exclude[/* keyof react.react.ComponentProps<'ul'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_ul[P /* <: js.Object */, T](component: ul, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[ul], 
      Exclude[/* keyof react.react.ComponentProps<'ul'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_use[P /* <: js.Object */, T](component: use, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[use], 
      Exclude[/* keyof react.react.ComponentProps<'use'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_use[P /* <: js.Object */, T](component: use, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[use], 
      Exclude[/* keyof react.react.ComponentProps<'use'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_var[P /* <: js.Object */, T](component: `var`, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[`var`], 
      Exclude[/* keyof react.react.ComponentProps<'var'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_var[P /* <: js.Object */, T](component: `var`, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[`var`], 
      Exclude[/* keyof react.react.ComponentProps<'var'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_video[P /* <: js.Object */, T](component: video, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[video], 
      Exclude[/* keyof react.react.ComponentProps<'video'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_video[P /* <: js.Object */, T](component: video, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[video], 
      Exclude[/* keyof react.react.ComponentProps<'video'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_view[P /* <: js.Object */, T](component: view, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[view], 
      Exclude[/* keyof react.react.ComponentProps<'view'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_view[P /* <: js.Object */, T](component: view, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[view], 
      Exclude[/* keyof react.react.ComponentProps<'view'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_wbr[P /* <: js.Object */, T](component: wbr, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[wbr], 
      Exclude[/* keyof react.react.ComponentProps<'wbr'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_wbr[P /* <: js.Object */, T](component: wbr, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[wbr], 
      Exclude[/* keyof react.react.ComponentProps<'wbr'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_webview[P /* <: js.Object */, T](component: webview, styledFn: js.Function1[/* props */ Theme[T] with P, StyleObject]): StyletronComponent[
    (Pick[
      ComponentProps[webview], 
      Exclude[/* keyof react.react.ComponentProps<'webview'> */ String, ClassName]
    ]) with P
  ] = js.native
  @JSImport("baseui", "styled")
  @js.native
  def styled_webview[P /* <: js.Object */, T](component: webview, styledFn: StyleObject): StyletronComponent[
    (Pick[
      ComponentProps[webview], 
      Exclude[/* keyof react.react.ComponentProps<'webview'> */ String, ClassName]
    ]) with P
  ] = js.native
  
  @JSImport("baseui", "useStyletron")
  @js.native
  val useStyletron: UseStyletronFn[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  ] = js.native
  
  @JSImport("baseui", "withStyle")
  @js.native
  val withStyle: WithStyleFn[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
  ] = js.native
  
  @js.native
  trait BaseProviderOverrides extends StObject {
    
    var AppContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
    
    var LayersContainer: js.UndefOr[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ] = js.native
  }
  object BaseProviderOverrides {
    
    @scala.inline
    def apply(): BaseProviderOverrides = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BaseProviderOverrides]
    }
    
    @scala.inline
    implicit class BaseProviderOverridesMutableBuilder[Self <: BaseProviderOverrides] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "AppContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAppContainerUndefined: Self = StObject.set(x, "AppContainer", js.undefined)
      
      @scala.inline
      def setLayersContainer(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Override<any> */ js.Any
      ): Self = StObject.set(x, "LayersContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLayersContainerUndefined: Self = StObject.set(x, "LayersContainer", js.undefined)
    }
  }
  
  @js.native
  trait BaseProviderProps extends StObject {
    
    var children: ReactElement = js.native
    
    var overrides: js.UndefOr[BaseProviderOverrides] = js.native
    
    var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
    
    var zIndex: js.UndefOr[Double] = js.native
  }
  object BaseProviderProps {
    
    @scala.inline
    def apply(
      theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
    ): BaseProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[BaseProviderProps]
    }
    
    @scala.inline
    implicit class BaseProviderPropsMutableBuilder[Self <: BaseProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setOverrides(value: BaseProviderOverrides): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
      
      @scala.inline
      def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
  
  @js.native
  trait LocaleProviderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var locale: PartialLocale = js.native
  }
  object LocaleProviderProps {
    
    @scala.inline
    def apply(locale: PartialLocale): LocaleProviderProps = {
      val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
      __obj.asInstanceOf[LocaleProviderProps]
    }
    
    @scala.inline
    implicit class LocaleProviderPropsMutableBuilder[Self <: LocaleProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setLocale(value: PartialLocale): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait StyledFn[T]
    extends typingsSlinky.styletronReact.mod.StyledFn {
    
    def apply[P /* <: js.Object */](component: `object`, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[`object`], 
          Exclude[/* keyof react.react.ComponentProps<'object'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: `var`, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[`var`], 
          Exclude[/* keyof react.react.ComponentProps<'var'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: abbr, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[abbr], 
          Exclude[/* keyof react.react.ComponentProps<'abbr'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: address, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[address], 
          Exclude[/* keyof react.react.ComponentProps<'address'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: animateMotion, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[animateMotion], 
          Exclude[/* keyof react.react.ComponentProps<'animateMotion'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: animateTransform, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[animateTransform], 
          Exclude[/* keyof react.react.ComponentProps<'animateTransform'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: animate, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[animate], 
          Exclude[/* keyof react.react.ComponentProps<'animate'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: area, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[area], 
          Exclude[/* keyof react.react.ComponentProps<'area'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: article, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[article], 
          Exclude[/* keyof react.react.ComponentProps<'article'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: aside, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[aside], 
          Exclude[/* keyof react.react.ComponentProps<'aside'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: a, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[a], 
          Exclude[/* keyof react.react.ComponentProps<'a'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: audio, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[audio], 
          Exclude[/* keyof react.react.ComponentProps<'audio'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: base, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[base], 
          Exclude[/* keyof react.react.ComponentProps<'base'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: bdi, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[bdi], 
          Exclude[/* keyof react.react.ComponentProps<'bdi'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: bdo, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[bdo], 
          Exclude[/* keyof react.react.ComponentProps<'bdo'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: big, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[big], 
          Exclude[/* keyof react.react.ComponentProps<'big'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: blockquote, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[blockquote], 
          Exclude[/* keyof react.react.ComponentProps<'blockquote'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: body, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[body], 
          Exclude[/* keyof react.react.ComponentProps<'body'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: br_, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[br_], 
          Exclude[/* keyof react.react.ComponentProps<'br'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: b, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[b], 
          Exclude[/* keyof react.react.ComponentProps<'b'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: button, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[button], 
          Exclude[/* keyof react.react.ComponentProps<'button'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: canvas, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[canvas], 
          Exclude[/* keyof react.react.ComponentProps<'canvas'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: caption, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[caption], 
          Exclude[/* keyof react.react.ComponentProps<'caption'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: circle, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[circle], 
          Exclude[/* keyof react.react.ComponentProps<'circle'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: cite, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[cite], 
          Exclude[/* keyof react.react.ComponentProps<'cite'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: clipPath, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[clipPath], 
          Exclude[/* keyof react.react.ComponentProps<'clipPath'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: code, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[code], 
          Exclude[/* keyof react.react.ComponentProps<'code'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: colgroup, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[colgroup], 
          Exclude[/* keyof react.react.ComponentProps<'colgroup'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: col, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[col], 
          Exclude[/* keyof react.react.ComponentProps<'col'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: datalist, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[datalist], 
          Exclude[/* keyof react.react.ComponentProps<'datalist'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: data, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[data], 
          Exclude[/* keyof react.react.ComponentProps<'data'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: dd, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[dd], 
          Exclude[/* keyof react.react.ComponentProps<'dd'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: defs, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[defs], 
          Exclude[/* keyof react.react.ComponentProps<'defs'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: del, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[del], 
          Exclude[/* keyof react.react.ComponentProps<'del'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: desc_, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[desc_], 
          Exclude[/* keyof react.react.ComponentProps<'desc'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: details, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[details], 
          Exclude[/* keyof react.react.ComponentProps<'details'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: dfn, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[dfn], 
          Exclude[/* keyof react.react.ComponentProps<'dfn'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: dialog, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[dialog], 
          Exclude[/* keyof react.react.ComponentProps<'dialog'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: div, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[div], 
          Exclude[/* keyof react.react.ComponentProps<'div'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: dl, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[dl], 
          Exclude[/* keyof react.react.ComponentProps<'dl'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: dt, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[dt], 
          Exclude[/* keyof react.react.ComponentProps<'dt'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: ellipse, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[ellipse], 
          Exclude[/* keyof react.react.ComponentProps<'ellipse'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: embed, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[embed], 
          Exclude[/* keyof react.react.ComponentProps<'embed'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: em, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[em], 
          Exclude[/* keyof react.react.ComponentProps<'em'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feBlend, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feBlend], 
          Exclude[/* keyof react.react.ComponentProps<'feBlend'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feColorMatrix, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feColorMatrix], 
          Exclude[/* keyof react.react.ComponentProps<'feColorMatrix'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feComponentTransfer, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feComponentTransfer], 
          Exclude[/* keyof react.react.ComponentProps<'feComponentTransfer'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feComposite, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feComposite], 
          Exclude[/* keyof react.react.ComponentProps<'feComposite'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feConvolveMatrix, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feConvolveMatrix], 
          Exclude[/* keyof react.react.ComponentProps<'feConvolveMatrix'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feDiffuseLighting, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feDiffuseLighting], 
          Exclude[/* keyof react.react.ComponentProps<'feDiffuseLighting'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feDisplacementMap, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feDisplacementMap], 
          Exclude[/* keyof react.react.ComponentProps<'feDisplacementMap'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feDistantLight, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feDistantLight], 
          Exclude[/* keyof react.react.ComponentProps<'feDistantLight'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feDropShadow, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feDropShadow], 
          Exclude[/* keyof react.react.ComponentProps<'feDropShadow'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feFlood, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feFlood], 
          Exclude[/* keyof react.react.ComponentProps<'feFlood'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feFuncA, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feFuncA], 
          Exclude[/* keyof react.react.ComponentProps<'feFuncA'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feFuncB, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feFuncB], 
          Exclude[/* keyof react.react.ComponentProps<'feFuncB'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feFuncG, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feFuncG], 
          Exclude[/* keyof react.react.ComponentProps<'feFuncG'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feFuncR, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feFuncR], 
          Exclude[/* keyof react.react.ComponentProps<'feFuncR'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feGaussianBlur, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feGaussianBlur], 
          Exclude[/* keyof react.react.ComponentProps<'feGaussianBlur'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feImage, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feImage], 
          Exclude[/* keyof react.react.ComponentProps<'feImage'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feMergeNode, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feMergeNode], 
          Exclude[/* keyof react.react.ComponentProps<'feMergeNode'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feMerge, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feMerge], 
          Exclude[/* keyof react.react.ComponentProps<'feMerge'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feMorphology, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feMorphology], 
          Exclude[/* keyof react.react.ComponentProps<'feMorphology'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feOffset, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feOffset], 
          Exclude[/* keyof react.react.ComponentProps<'feOffset'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: fePointLight, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[fePointLight], 
          Exclude[/* keyof react.react.ComponentProps<'fePointLight'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feSpecularLighting, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feSpecularLighting], 
          Exclude[/* keyof react.react.ComponentProps<'feSpecularLighting'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feSpotLight, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feSpotLight], 
          Exclude[/* keyof react.react.ComponentProps<'feSpotLight'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feTile, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feTile], 
          Exclude[/* keyof react.react.ComponentProps<'feTile'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: feTurbulence, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[feTurbulence], 
          Exclude[/* keyof react.react.ComponentProps<'feTurbulence'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: fieldset, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[fieldset], 
          Exclude[/* keyof react.react.ComponentProps<'fieldset'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: figcaption, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[figcaption], 
          Exclude[/* keyof react.react.ComponentProps<'figcaption'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: figure, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[figure], 
          Exclude[/* keyof react.react.ComponentProps<'figure'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: filter, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[filter], 
          Exclude[/* keyof react.react.ComponentProps<'filter'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: footer, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[footer], 
          Exclude[/* keyof react.react.ComponentProps<'footer'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: foreignObject, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[foreignObject], 
          Exclude[/* keyof react.react.ComponentProps<'foreignObject'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: form, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[form], 
          Exclude[/* keyof react.react.ComponentProps<'form'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: g, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[g], 
          Exclude[/* keyof react.react.ComponentProps<'g'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: h1, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[h1], 
          Exclude[/* keyof react.react.ComponentProps<'h1'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: h2, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[h2], 
          Exclude[/* keyof react.react.ComponentProps<'h2'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: h3, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[h3], 
          Exclude[/* keyof react.react.ComponentProps<'h3'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: h4, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[h4], 
          Exclude[/* keyof react.react.ComponentProps<'h4'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: h5, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[h5], 
          Exclude[/* keyof react.react.ComponentProps<'h5'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: h6, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[h6], 
          Exclude[/* keyof react.react.ComponentProps<'h6'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: header, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[header], 
          Exclude[/* keyof react.react.ComponentProps<'header'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: head, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[head], 
          Exclude[/* keyof react.react.ComponentProps<'head'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: hgroup, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[hgroup], 
          Exclude[/* keyof react.react.ComponentProps<'hgroup'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: hr_, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[hr_], 
          Exclude[/* keyof react.react.ComponentProps<'hr'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: html, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[html], 
          Exclude[/* keyof react.react.ComponentProps<'html'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: iframe, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[iframe], 
          Exclude[/* keyof react.react.ComponentProps<'iframe'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: image, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[image], 
          Exclude[/* keyof react.react.ComponentProps<'image'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: img, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[img], 
          Exclude[/* keyof react.react.ComponentProps<'img'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: input, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[input], 
          Exclude[/* keyof react.react.ComponentProps<'input'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: ins, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[ins], 
          Exclude[/* keyof react.react.ComponentProps<'ins'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: i, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[i], 
          Exclude[/* keyof react.react.ComponentProps<'i'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: kbd, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[kbd], 
          Exclude[/* keyof react.react.ComponentProps<'kbd'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: keygen, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[keygen], 
          Exclude[/* keyof react.react.ComponentProps<'keygen'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: label, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[label], 
          Exclude[/* keyof react.react.ComponentProps<'label'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: legend, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[legend], 
          Exclude[/* keyof react.react.ComponentProps<'legend'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: li_, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[li_], 
          Exclude[/* keyof react.react.ComponentProps<'li'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: linearGradient, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[linearGradient], 
          Exclude[/* keyof react.react.ComponentProps<'linearGradient'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: line, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[line], 
          Exclude[/* keyof react.react.ComponentProps<'line'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: link, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[link], 
          Exclude[/* keyof react.react.ComponentProps<'link'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: main, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[main], 
          Exclude[/* keyof react.react.ComponentProps<'main'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: map, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[map], 
          Exclude[/* keyof react.react.ComponentProps<'map'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: marker, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[marker], 
          Exclude[/* keyof react.react.ComponentProps<'marker'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: mark, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[mark], 
          Exclude[/* keyof react.react.ComponentProps<'mark'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: mask, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[mask], 
          Exclude[/* keyof react.react.ComponentProps<'mask'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: menuitem, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[menuitem], 
          Exclude[/* keyof react.react.ComponentProps<'menuitem'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: menu, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[menu], 
          Exclude[/* keyof react.react.ComponentProps<'menu'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: metadata, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[metadata], 
          Exclude[/* keyof react.react.ComponentProps<'metadata'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: meta, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[meta], 
          Exclude[/* keyof react.react.ComponentProps<'meta'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: meter, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[meter], 
          Exclude[/* keyof react.react.ComponentProps<'meter'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: mpath, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[mpath], 
          Exclude[/* keyof react.react.ComponentProps<'mpath'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: nav, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[nav], 
          Exclude[/* keyof react.react.ComponentProps<'nav'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: noindex, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[noindex], 
          Exclude[/* keyof react.react.ComponentProps<'noindex'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: noscript, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[noscript], 
          Exclude[/* keyof react.react.ComponentProps<'noscript'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: ol, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[ol], 
          Exclude[/* keyof react.react.ComponentProps<'ol'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: optgroup, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[optgroup], 
          Exclude[/* keyof react.react.ComponentProps<'optgroup'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: option, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[option], 
          Exclude[/* keyof react.react.ComponentProps<'option'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: output, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[output], 
          Exclude[/* keyof react.react.ComponentProps<'output'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: param, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[param], 
          Exclude[/* keyof react.react.ComponentProps<'param'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: path, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[path], 
          Exclude[/* keyof react.react.ComponentProps<'path'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: pattern, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[pattern], 
          Exclude[/* keyof react.react.ComponentProps<'pattern'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: picture, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[picture], 
          Exclude[/* keyof react.react.ComponentProps<'picture'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: polygon, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[polygon], 
          Exclude[/* keyof react.react.ComponentProps<'polygon'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: polyline, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[polyline], 
          Exclude[/* keyof react.react.ComponentProps<'polyline'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: pre, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[pre], 
          Exclude[/* keyof react.react.ComponentProps<'pre'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: progress, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[progress], 
          Exclude[/* keyof react.react.ComponentProps<'progress'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: p, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[p], 
          Exclude[/* keyof react.react.ComponentProps<'p'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: q, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[q], 
          Exclude[/* keyof react.react.ComponentProps<'q'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: radialGradient, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[radialGradient], 
          Exclude[/* keyof react.react.ComponentProps<'radialGradient'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: rect, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[rect], 
          Exclude[/* keyof react.react.ComponentProps<'rect'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: rp, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[rp], 
          Exclude[/* keyof react.react.ComponentProps<'rp'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: rt, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[rt], 
          Exclude[/* keyof react.react.ComponentProps<'rt'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: ruby, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[ruby], 
          Exclude[/* keyof react.react.ComponentProps<'ruby'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: samp, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[samp], 
          Exclude[/* keyof react.react.ComponentProps<'samp'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: script, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[script], 
          Exclude[/* keyof react.react.ComponentProps<'script'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: section, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[section], 
          Exclude[/* keyof react.react.ComponentProps<'section'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: select, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[select], 
          Exclude[/* keyof react.react.ComponentProps<'select'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: slot, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[slot], 
          Exclude[/* keyof react.react.ComponentProps<'slot'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: small_, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[small_], 
          Exclude[/* keyof react.react.ComponentProps<'small'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: source, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[source], 
          Exclude[/* keyof react.react.ComponentProps<'source'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: span, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[span], 
          Exclude[/* keyof react.react.ComponentProps<'span'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: s, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[s], 
          Exclude[/* keyof react.react.ComponentProps<'s'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: stop, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[stop], 
          Exclude[/* keyof react.react.ComponentProps<'stop'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: strong, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[strong], 
          Exclude[/* keyof react.react.ComponentProps<'strong'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: style, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[style], 
          Exclude[/* keyof react.react.ComponentProps<'style'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: sub, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[sub], 
          Exclude[/* keyof react.react.ComponentProps<'sub'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: summary, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[summary], 
          Exclude[/* keyof react.react.ComponentProps<'summary'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: sup, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[sup], 
          Exclude[/* keyof react.react.ComponentProps<'sup'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: svg, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[svg], 
          Exclude[/* keyof react.react.ComponentProps<'svg'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: switch, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[switch], 
          Exclude[/* keyof react.react.ComponentProps<'switch'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: symbol, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[symbol], 
          Exclude[/* keyof react.react.ComponentProps<'symbol'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: table, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[table], 
          Exclude[/* keyof react.react.ComponentProps<'table'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: tbody, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[tbody], 
          Exclude[/* keyof react.react.ComponentProps<'tbody'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: td_, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[td_], 
          Exclude[/* keyof react.react.ComponentProps<'td'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: template, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[template], 
          Exclude[/* keyof react.react.ComponentProps<'template'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: textPath, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[textPath], 
          Exclude[/* keyof react.react.ComponentProps<'textPath'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: textarea, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[textarea], 
          Exclude[/* keyof react.react.ComponentProps<'textarea'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: text, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[text], 
          Exclude[/* keyof react.react.ComponentProps<'text'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: tfoot, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[tfoot], 
          Exclude[/* keyof react.react.ComponentProps<'tfoot'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: th_, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[th_], 
          Exclude[/* keyof react.react.ComponentProps<'th'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: thead, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[thead], 
          Exclude[/* keyof react.react.ComponentProps<'thead'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: time, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[time], 
          Exclude[/* keyof react.react.ComponentProps<'time'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: title, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[title], 
          Exclude[/* keyof react.react.ComponentProps<'title'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: tr_, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[tr_], 
          Exclude[/* keyof react.react.ComponentProps<'tr'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: track, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[track], 
          Exclude[/* keyof react.react.ComponentProps<'track'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: tspan, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[tspan], 
          Exclude[/* keyof react.react.ComponentProps<'tspan'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: ul, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[ul], 
          Exclude[/* keyof react.react.ComponentProps<'ul'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: use, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[use], 
          Exclude[/* keyof react.react.ComponentProps<'use'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: u, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[u], 
          Exclude[/* keyof react.react.ComponentProps<'u'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: video, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[video], 
          Exclude[/* keyof react.react.ComponentProps<'video'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: view, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[view], 
          Exclude[/* keyof react.react.ComponentProps<'view'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: wbr, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[wbr], 
          Exclude[/* keyof react.react.ComponentProps<'wbr'> */ String, ClassName]
        ]) with P
      ] = js.native
    def apply[P /* <: js.Object */](component: webview, style: js.Function1[/* props */ ThemeT[T] with P, StyleObject]): StyletronComponent[
        (Pick[
          ComponentProps[webview], 
          Exclude[/* keyof react.react.ComponentProps<'webview'> */ String, ClassName]
        ]) with P
      ] = js.native
  }
  
  @js.native
  trait ThemeProviderProps extends StObject {
    
    var children: js.UndefOr[ReactElement] = js.native
    
    var theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any = js.native
  }
  object ThemeProviderProps {
    
    @scala.inline
    def apply(
      theme: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
    ): ThemeProviderProps = {
      val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
      __obj.asInstanceOf[ThemeProviderProps]
    }
    
    @scala.inline
    implicit class ThemeProviderPropsMutableBuilder[Self <: ThemeProviderProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenReactElement(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setTheme(
        value: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Theme */ js.Any
      ): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
    }
  }
  
  type UseStyletronFn[Theme] = js.Function0[js.Tuple2[js.Function1[/* arg */ StyleObject, String], Theme]]
  
  @js.native
  trait WithStyleFn[T]
    extends typingsSlinky.styletronReact.mod.WithStyleFn
}
