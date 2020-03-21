package typingsSlinky.grommet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object utilsMod {
  type A11yTitleType = java.lang.String
  type AnimateType = scala.Boolean
  type BackgroundType = java.lang.String | typingsSlinky.grommet.AnonImage
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.xxsmall
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - typingsSlinky.grommet.grommetStrings.xxlarge
    - typingsSlinky.grommet.grommetStrings.full
    - typingsSlinky.grommet.grommetStrings.`1Slash2`
    - typingsSlinky.grommet.grommetStrings.`1Slash3`
    - typingsSlinky.grommet.grommetStrings.`2Slash3`
    - typingsSlinky.grommet.grommetStrings.`1Slash4`
    - typingsSlinky.grommet.grommetStrings.`2Slash4`
    - typingsSlinky.grommet.grommetStrings.`3Slash4`
    - typingsSlinky.grommet.grommetStrings.auto
    - java.lang.String
  */
  type BasisType = typingsSlinky.grommet.utilsMod._BasisType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - scala.Boolean
    - typingsSlinky.grommet.utilsMod.BoxSideType
    - typingsSlinky.grommet.AnonStyle
    - js.Array[typingsSlinky.grommet.AnonSizeStyle]
  */
  type BorderType = typingsSlinky.grommet.utilsMod._BorderType | js.Array[typingsSlinky.grommet.AnonSizeStyle] | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type BoxSizeType = typingsSlinky.grommet.utilsMod._BoxSizeType | java.lang.String
  type ColorType = js.UndefOr[java.lang.String | typingsSlinky.grommet.AnonLight]
  type DeepFreeze_ = js.Function1[/* obj */ js.Object, typingsSlinky.grommet.utilsMod.DeepReadonly[js.Object]]
  type DeepReadonly[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {readonly [ K in keyof T ]: T[K] extends object? / * import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias grommet.grommet/utils.DeepReadonly<T[K]> * / object : T[K]}
    */ typingsSlinky.grommet.grommetStrings.DeepReadonly with js.Any
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.none
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type ElevationType = typingsSlinky.grommet.utilsMod._ElevationType | java.lang.String
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.horizontal
    - typingsSlinky.grommet.grommetStrings.vertical
    - scala.Boolean
  */
  type FillType = typingsSlinky.grommet.utilsMod._FillType | scala.Boolean
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.none
    - typingsSlinky.grommet.grommetStrings.xxsmall
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - java.lang.String
  */
  type GapType = typingsSlinky.grommet.utilsMod._GapType | java.lang.String
  type GraphColorsType = js.Array[java.lang.String] | typingsSlinky.grommet.AnonDarkArray
  type GridAreaType = java.lang.String
  type KeyboardType = js.Function1[
    /* event */ slinky.web.SyntheticKeyboardEvent[org.scalajs.dom.raw.HTMLElement], 
    scala.Unit
  ]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.none
    - typingsSlinky.grommet.grommetStrings.xxsmall
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - typingsSlinky.grommet.AnonBottom
    - java.lang.String
  */
  type MarginType = typingsSlinky.grommet.utilsMod._MarginType | java.lang.String
  type NonUndefined[T] = T
  type NonUndefinedProps[T /* <: js.Object */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ K in keyof T ]:? grommet.grommet/utils.NonUndefined<T[K]>}
    */ typingsSlinky.grommet.grommetStrings.NonUndefinedProps with T
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[java.lang.String, K]]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.weak
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.strong
    - java.lang.String
    - typingsSlinky.grommet.grommetBooleans.`true`
    - typingsSlinky.grommet.grommetBooleans.`false`
    - scala.Double
  */
  type OpacityType = typingsSlinky.grommet.utilsMod._OpacityType | java.lang.String | scala.Double
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.none
    - typingsSlinky.grommet.grommetStrings.xxsmall
    - typingsSlinky.grommet.grommetStrings.xsmall
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.medium
    - typingsSlinky.grommet.grommetStrings.large
    - typingsSlinky.grommet.grommetStrings.xlarge
    - typingsSlinky.grommet.AnonBottom
    - java.lang.String
  */
  type PadType = typingsSlinky.grommet.utilsMod._PadType | java.lang.String
  type PlaceHolderType = java.lang.String | slinky.core.facade.ReactElement | slinky.core.TagMod[scala.Any]
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.grommet.grommetStrings.a
    - typingsSlinky.grommet.grommetStrings.abbr
    - typingsSlinky.grommet.grommetStrings.address
    - typingsSlinky.grommet.grommetStrings.area
    - typingsSlinky.grommet.grommetStrings.article
    - typingsSlinky.grommet.grommetStrings.aside
    - typingsSlinky.grommet.grommetStrings.audio
    - typingsSlinky.grommet.grommetStrings.b
    - typingsSlinky.grommet.grommetStrings.base
    - typingsSlinky.grommet.grommetStrings.bdi
    - typingsSlinky.grommet.grommetStrings.bdo
    - typingsSlinky.grommet.grommetStrings.big
    - typingsSlinky.grommet.grommetStrings.blockquote
    - typingsSlinky.grommet.grommetStrings.body
    - typingsSlinky.grommet.grommetStrings.br
    - typingsSlinky.grommet.grommetStrings.button
    - typingsSlinky.grommet.grommetStrings.canvas
    - typingsSlinky.grommet.grommetStrings.caption
    - typingsSlinky.grommet.grommetStrings.cite
    - typingsSlinky.grommet.grommetStrings.code
    - typingsSlinky.grommet.grommetStrings.col
    - typingsSlinky.grommet.grommetStrings.colgroup
    - typingsSlinky.grommet.grommetStrings.data
    - typingsSlinky.grommet.grommetStrings.datalist
    - typingsSlinky.grommet.grommetStrings.dd
    - typingsSlinky.grommet.grommetStrings.del
    - typingsSlinky.grommet.grommetStrings.details
    - typingsSlinky.grommet.grommetStrings.dfn
    - typingsSlinky.grommet.grommetStrings.dialog
    - typingsSlinky.grommet.grommetStrings.div
    - typingsSlinky.grommet.grommetStrings.dl
    - typingsSlinky.grommet.grommetStrings.dt
    - typingsSlinky.grommet.grommetStrings.em
    - typingsSlinky.grommet.grommetStrings.embed
    - typingsSlinky.grommet.grommetStrings.fieldset
    - typingsSlinky.grommet.grommetStrings.figcaption
    - typingsSlinky.grommet.grommetStrings.figure
    - typingsSlinky.grommet.grommetStrings.footer
    - typingsSlinky.grommet.grommetStrings.form
    - typingsSlinky.grommet.grommetStrings.h1
    - typingsSlinky.grommet.grommetStrings.h2
    - typingsSlinky.grommet.grommetStrings.h3
    - typingsSlinky.grommet.grommetStrings.h4
    - typingsSlinky.grommet.grommetStrings.h5
    - typingsSlinky.grommet.grommetStrings.h6
    - typingsSlinky.grommet.grommetStrings.head
    - typingsSlinky.grommet.grommetStrings.header
    - typingsSlinky.grommet.grommetStrings.hgroup
    - typingsSlinky.grommet.grommetStrings.hr
    - typingsSlinky.grommet.grommetStrings.html
    - typingsSlinky.grommet.grommetStrings.i
    - typingsSlinky.grommet.grommetStrings.iframe
    - typingsSlinky.grommet.grommetStrings.img
    - typingsSlinky.grommet.grommetStrings.input
    - typingsSlinky.grommet.grommetStrings.ins
    - typingsSlinky.grommet.grommetStrings.kbd
    - typingsSlinky.grommet.grommetStrings.keygen
    - typingsSlinky.grommet.grommetStrings.label
    - typingsSlinky.grommet.grommetStrings.legend
    - typingsSlinky.grommet.grommetStrings.li
    - typingsSlinky.grommet.grommetStrings.link
    - typingsSlinky.grommet.grommetStrings.main
    - typingsSlinky.grommet.grommetStrings.map
    - typingsSlinky.grommet.grommetStrings.mark
    - typingsSlinky.grommet.grommetStrings.menu
    - typingsSlinky.grommet.grommetStrings.menuitem
    - typingsSlinky.grommet.grommetStrings.meta
    - typingsSlinky.grommet.grommetStrings.meter
    - typingsSlinky.grommet.grommetStrings.nav
    - typingsSlinky.grommet.grommetStrings.noindex
    - typingsSlinky.grommet.grommetStrings.noscript
    - typingsSlinky.grommet.grommetStrings.`object`
    - typingsSlinky.grommet.grommetStrings.ol
    - typingsSlinky.grommet.grommetStrings.optgroup
    - typingsSlinky.grommet.grommetStrings.option
    - typingsSlinky.grommet.grommetStrings.output
    - typingsSlinky.grommet.grommetStrings.p
    - typingsSlinky.grommet.grommetStrings.param
    - typingsSlinky.grommet.grommetStrings.picture
    - typingsSlinky.grommet.grommetStrings.pre
    - typingsSlinky.grommet.grommetStrings.progress
    - typingsSlinky.grommet.grommetStrings.q
    - typingsSlinky.grommet.grommetStrings.rp
    - typingsSlinky.grommet.grommetStrings.rt
    - typingsSlinky.grommet.grommetStrings.ruby
    - typingsSlinky.grommet.grommetStrings.s
    - typingsSlinky.grommet.grommetStrings.samp
    - typingsSlinky.grommet.grommetStrings.script
    - typingsSlinky.grommet.grommetStrings.section
    - typingsSlinky.grommet.grommetStrings.select
    - typingsSlinky.grommet.grommetStrings.small
    - typingsSlinky.grommet.grommetStrings.source
    - typingsSlinky.grommet.grommetStrings.span
    - typingsSlinky.grommet.grommetStrings.strong
    - typingsSlinky.grommet.grommetStrings.style
    - typingsSlinky.grommet.grommetStrings.sub
    - typingsSlinky.grommet.grommetStrings.summary
    - typingsSlinky.grommet.grommetStrings.sup
    - typingsSlinky.grommet.grommetStrings.table
    - typingsSlinky.grommet.grommetStrings.template
    - typingsSlinky.grommet.grommetStrings.tbody
    - typingsSlinky.grommet.grommetStrings.td
    - typingsSlinky.grommet.grommetStrings.textarea
    - typingsSlinky.grommet.grommetStrings.tfoot
    - typingsSlinky.grommet.grommetStrings.th
    - typingsSlinky.grommet.grommetStrings.thead
    - typingsSlinky.grommet.grommetStrings.time
    - typingsSlinky.grommet.grommetStrings.title
    - typingsSlinky.grommet.grommetStrings.tr
    - typingsSlinky.grommet.grommetStrings.track
    - typingsSlinky.grommet.grommetStrings.u
    - typingsSlinky.grommet.grommetStrings.ul
    - typingsSlinky.grommet.grommetStrings.`var`
    - typingsSlinky.grommet.grommetStrings.video
    - typingsSlinky.grommet.grommetStrings.wbr
    - typingsSlinky.grommet.grommetStrings.webview
    - typingsSlinky.grommet.grommetStrings.svg
    - typingsSlinky.grommet.grommetStrings.animate
    - typingsSlinky.grommet.grommetStrings.animateMotion
    - typingsSlinky.grommet.grommetStrings.animateTransform
    - typingsSlinky.grommet.grommetStrings.circle
    - typingsSlinky.grommet.grommetStrings.clipPath
    - typingsSlinky.grommet.grommetStrings.defs
    - typingsSlinky.grommet.grommetStrings.desc
    - typingsSlinky.grommet.grommetStrings.ellipse
    - typingsSlinky.grommet.grommetStrings.feBlend
    - typingsSlinky.grommet.grommetStrings.feColorMatrix
    - typingsSlinky.grommet.grommetStrings.feComponentTransfer
    - typingsSlinky.grommet.grommetStrings.feComposite
    - typingsSlinky.grommet.grommetStrings.feConvolveMatrix
    - typingsSlinky.grommet.grommetStrings.feDiffuseLighting
    - typingsSlinky.grommet.grommetStrings.feDisplacementMap
    - typingsSlinky.grommet.grommetStrings.feDistantLight
    - typingsSlinky.grommet.grommetStrings.feDropShadow
    - typingsSlinky.grommet.grommetStrings.feFlood
    - typingsSlinky.grommet.grommetStrings.feFuncA
    - typingsSlinky.grommet.grommetStrings.feFuncB
    - typingsSlinky.grommet.grommetStrings.feFuncG
    - typingsSlinky.grommet.grommetStrings.feFuncR
    - typingsSlinky.grommet.grommetStrings.feGaussianBlur
    - typingsSlinky.grommet.grommetStrings.feImage
    - typingsSlinky.grommet.grommetStrings.feMerge
    - typingsSlinky.grommet.grommetStrings.feMergeNode
    - typingsSlinky.grommet.grommetStrings.feMorphology
    - typingsSlinky.grommet.grommetStrings.feOffset
    - typingsSlinky.grommet.grommetStrings.fePointLight
    - typingsSlinky.grommet.grommetStrings.feSpecularLighting
    - typingsSlinky.grommet.grommetStrings.feSpotLight
    - typingsSlinky.grommet.grommetStrings.feTile
    - typingsSlinky.grommet.grommetStrings.feTurbulence
    - typingsSlinky.grommet.grommetStrings.filter
    - typingsSlinky.grommet.grommetStrings.foreignObject
    - typingsSlinky.grommet.grommetStrings.g
    - typingsSlinky.grommet.grommetStrings.image
    - typingsSlinky.grommet.grommetStrings.line
    - typingsSlinky.grommet.grommetStrings.linearGradient
    - typingsSlinky.grommet.grommetStrings.marker
    - typingsSlinky.grommet.grommetStrings.mask
    - typingsSlinky.grommet.grommetStrings.metadata
    - typingsSlinky.grommet.grommetStrings.mpath
    - typingsSlinky.grommet.grommetStrings.path
    - typingsSlinky.grommet.grommetStrings.pattern
    - typingsSlinky.grommet.grommetStrings.polygon
    - typingsSlinky.grommet.grommetStrings.polyline
    - typingsSlinky.grommet.grommetStrings.radialGradient
    - typingsSlinky.grommet.grommetStrings.rect
    - typingsSlinky.grommet.grommetStrings.stop
    - typingsSlinky.grommet.grommetStrings.switch
    - typingsSlinky.grommet.grommetStrings.symbol
    - typingsSlinky.grommet.grommetStrings.text
    - typingsSlinky.grommet.grommetStrings.textPath
    - typingsSlinky.grommet.grommetStrings.tspan
    - typingsSlinky.grommet.grommetStrings.use
    - typingsSlinky.grommet.grommetStrings.view
    - typingsSlinky.react.mod.ComponentType[js.Any]
  */
  type PolymorphicType = typingsSlinky.grommet.utilsMod._PolymorphicType | slinky.core.ReactComponentClass[js.Any]
}
