package typingsSlinky.atMaterialDashUiSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atMaterialDashUiSystemMod {
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.alignContent
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.alignItems
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.alignSelf
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.bottom
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.boxShadow
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.displayPrint
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.flex
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.flexBasis
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.flexDirection
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.flexGrow
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.flexShrink
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.flexWrap
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.justifyContent
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.justifyItems
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.justifySelf
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.left
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.m
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.margin
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.marginBottom
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.marginLeft
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.marginRight
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.marginTop
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.marginX
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.marginY
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.mb
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.ml
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.mr
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.mt
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.mx
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.my
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.order
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.overflow
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.p
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.padding
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.paddingBottom
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.paddingLeft
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.paddingRight
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.paddingTop
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.paddingX
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.paddingY
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.pb
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.pl
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.position
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.pr
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.pt
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.px
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.py
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.right
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.textOverflow
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.top
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.visibility
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.whiteSpace
  import typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.zIndex
  import typingsSlinky.std.Exclude
  import typingsSlinky.std.Partial
  import typingsSlinky.std.Pick
  import typingsSlinky.std.Record

  type BordersProps = PropsFor[
    SimpleStyleFunction[
      typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.border | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.borderTop | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.borderRight | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.borderBottom | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.borderLeft | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.borderColor | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.borderRadius
    ]
  ]
  // compose.js
  /**
    * given a list of StyleFunction return the intersection of the props each individual
    * StyleFunction requires.
    *
    * If `firstFn` requires { color: string } and `secondFn` requires { spacing: number }
    * their composed function requires { color: string, spacing: number }
    */
  type ComposedArg[T] = js.Any
  type ComposedStyleFunction[T /* <: js.Array[StyleFunction[_]] */] = StyleFunction[ComposedStyleProps[T]]
  type ComposedStyleProps[T] = ComposedArg[T]
  type DisplayProps = PropsFor[
    SimpleStyleFunction[
      typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.display | displayPrint | overflow | textOverflow | visibility | whiteSpace
    ]
  ]
  type FlexboxProps = PropsFor[
    SimpleStyleFunction[
      flexBasis | flexDirection | flexWrap | justifyContent | alignItems | alignContent | order | flex | flexGrow | flexShrink | alignSelf | justifyItems | justifySelf
    ]
  ]
  // utils
  type Omit[T, K] = Pick[T, Exclude[String, K]]
  type PaletteProps = PropsFor[
    SimpleStyleFunction[
      typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.bgcolor | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.color
    ]
  ]
  type PositionsProps = PropsFor[SimpleStyleFunction[zIndex | position | top | right | bottom | left]]
  type PropsFor[SomeStyleFunction] = js.Any
  type ShadowsProps = PropsFor[SimpleStyleFunction[boxShadow]]
  type SimpleStyleFunction[PropKey /* <: String */] = StyleFunction[Partial[Record[PropKey, js.Any]]]
  type SizingProps = PropsFor[
    SimpleStyleFunction[
      typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.width | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.maxWidth | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.minWidth | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.height | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.maxHeight | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.minHeight | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.sizeWidth | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.sizeHeight
    ]
  ]
  type SpacingProps = PropsFor[
    SimpleStyleFunction[
      m | mt | mr | mb | ml | mx | my | p | pt | pr | pb | pl | px | py | margin | marginTop | marginRight | marginBottom | marginLeft | marginX | marginY | padding | paddingTop | paddingRight | paddingBottom | paddingLeft | paddingX | paddingY
    ]
  ]
  type StyleFunction[Props] = js.Function1[/* props */ Props, js.Any]
  type TypographyProps = PropsFor[
    SimpleStyleFunction[
      typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.fontFamily | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.fontSize | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.fontStyle | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.fontWeight | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.letterSpacing | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.lineHeight | typingsSlinky.atMaterialDashUiSystem.atMaterialDashUiSystemStrings.textAlign
    ]
  ]
}
