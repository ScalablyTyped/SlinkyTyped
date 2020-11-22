package typingsSlinky.materialUiSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type BordersProps = typingsSlinky.materialUiSystem.mod.PropsFor[
    typingsSlinky.materialUiSystem.mod.SimpleStyleFunction[
      typingsSlinky.materialUiSystem.materialUiSystemStrings.border | typingsSlinky.materialUiSystem.materialUiSystemStrings.borderTop | typingsSlinky.materialUiSystem.materialUiSystemStrings.borderRight | typingsSlinky.materialUiSystem.materialUiSystemStrings.borderBottom | typingsSlinky.materialUiSystem.materialUiSystemStrings.borderLeft | typingsSlinky.materialUiSystem.materialUiSystemStrings.borderColor | typingsSlinky.materialUiSystem.materialUiSystemStrings.borderRadius
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
  
  type ComposedStyleFunction[T /* <: js.Array[typingsSlinky.materialUiSystem.mod.StyleFunction[_]] */] = typingsSlinky.materialUiSystem.mod.StyleFunction[typingsSlinky.materialUiSystem.mod.ComposedStyleProps[T]]
  
  type ComposedStyleProps[T] = typingsSlinky.materialUiSystem.mod.ComposedArg[T]
  
  type DisplayProps = typingsSlinky.materialUiSystem.mod.PropsFor[
    typingsSlinky.materialUiSystem.mod.SimpleStyleFunction[
      typingsSlinky.materialUiSystem.materialUiSystemStrings.display | typingsSlinky.materialUiSystem.materialUiSystemStrings.displayPrint | typingsSlinky.materialUiSystem.materialUiSystemStrings.overflow | typingsSlinky.materialUiSystem.materialUiSystemStrings.textOverflow | typingsSlinky.materialUiSystem.materialUiSystemStrings.visibility | typingsSlinky.materialUiSystem.materialUiSystemStrings.whiteSpace
    ]
  ]
  
  type FlexboxProps = typingsSlinky.materialUiSystem.mod.PropsFor[
    typingsSlinky.materialUiSystem.mod.SimpleStyleFunction[
      typingsSlinky.materialUiSystem.materialUiSystemStrings.flexBasis | typingsSlinky.materialUiSystem.materialUiSystemStrings.flexDirection | typingsSlinky.materialUiSystem.materialUiSystemStrings.flexWrap | typingsSlinky.materialUiSystem.materialUiSystemStrings.justifyContent | typingsSlinky.materialUiSystem.materialUiSystemStrings.alignItems | typingsSlinky.materialUiSystem.materialUiSystemStrings.alignContent | typingsSlinky.materialUiSystem.materialUiSystemStrings.order | typingsSlinky.materialUiSystem.materialUiSystemStrings.flex | typingsSlinky.materialUiSystem.materialUiSystemStrings.flexGrow | typingsSlinky.materialUiSystem.materialUiSystemStrings.flexShrink | typingsSlinky.materialUiSystem.materialUiSystemStrings.alignSelf | typingsSlinky.materialUiSystem.materialUiSystemStrings.justifyItems | typingsSlinky.materialUiSystem.materialUiSystemStrings.justifySelf
    ]
  ]
  
  type GridProps = typingsSlinky.materialUiSystem.mod.PropsFor[
    typingsSlinky.materialUiSystem.mod.SimpleStyleFunction[
      typingsSlinky.materialUiSystem.materialUiSystemStrings.gridGap | typingsSlinky.materialUiSystem.materialUiSystemStrings.gridColumnGap | typingsSlinky.materialUiSystem.materialUiSystemStrings.gridRowGap | typingsSlinky.materialUiSystem.materialUiSystemStrings.gridColumn | typingsSlinky.materialUiSystem.materialUiSystemStrings.gridRow | typingsSlinky.materialUiSystem.materialUiSystemStrings.gridAutoFlow | typingsSlinky.materialUiSystem.materialUiSystemStrings.gridAutoColumns | typingsSlinky.materialUiSystem.materialUiSystemStrings.gridAutoRows | typingsSlinky.materialUiSystem.materialUiSystemStrings.gridTemplateColumns | typingsSlinky.materialUiSystem.materialUiSystemStrings.gridTemplateRows | typingsSlinky.materialUiSystem.materialUiSystemStrings.gridTemplateAreas | typingsSlinky.materialUiSystem.materialUiSystemStrings.gridArea
    ]
  ]
  
  // utils
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  
  type PaletteProps = typingsSlinky.materialUiSystem.mod.PropsFor[
    typingsSlinky.materialUiSystem.mod.SimpleStyleFunction[
      typingsSlinky.materialUiSystem.materialUiSystemStrings.bgcolor | typingsSlinky.materialUiSystem.materialUiSystemStrings.color
    ]
  ]
  
  type PositionsProps = typingsSlinky.materialUiSystem.mod.PropsFor[
    typingsSlinky.materialUiSystem.mod.SimpleStyleFunction[
      typingsSlinky.materialUiSystem.materialUiSystemStrings.zIndex | typingsSlinky.materialUiSystem.materialUiSystemStrings.position | typingsSlinky.materialUiSystem.materialUiSystemStrings.top | typingsSlinky.materialUiSystem.materialUiSystemStrings.right | typingsSlinky.materialUiSystem.materialUiSystemStrings.bottom | typingsSlinky.materialUiSystem.materialUiSystemStrings.left
    ]
  ]
  
  type PropsFor[SomeStyleFunction] = js.Any
  
  type ShadowsProps = typingsSlinky.materialUiSystem.mod.PropsFor[
    typingsSlinky.materialUiSystem.mod.SimpleStyleFunction[typingsSlinky.materialUiSystem.materialUiSystemStrings.boxShadow]
  ]
  
  type SimpleStyleFunction[PropKey /* <: /* keyof any */ java.lang.String */] = typingsSlinky.materialUiSystem.mod.StyleFunction[typingsSlinky.std.Partial[typingsSlinky.std.Record[PropKey, js.Any]]]
  
  type SizingProps = typingsSlinky.materialUiSystem.mod.PropsFor[
    typingsSlinky.materialUiSystem.mod.SimpleStyleFunction[
      typingsSlinky.materialUiSystem.materialUiSystemStrings.width | typingsSlinky.materialUiSystem.materialUiSystemStrings.maxWidth | typingsSlinky.materialUiSystem.materialUiSystemStrings.minWidth | typingsSlinky.materialUiSystem.materialUiSystemStrings.height | typingsSlinky.materialUiSystem.materialUiSystemStrings.maxHeight | typingsSlinky.materialUiSystem.materialUiSystemStrings.minHeight | typingsSlinky.materialUiSystem.materialUiSystemStrings.sizeWidth | typingsSlinky.materialUiSystem.materialUiSystemStrings.sizeHeight | typingsSlinky.materialUiSystem.materialUiSystemStrings.boxSizing
    ]
  ]
  
  type SpacingProps = typingsSlinky.materialUiSystem.mod.PropsFor[
    typingsSlinky.materialUiSystem.mod.SimpleStyleFunction[
      typingsSlinky.materialUiSystem.materialUiSystemStrings.m | typingsSlinky.materialUiSystem.materialUiSystemStrings.mt | typingsSlinky.materialUiSystem.materialUiSystemStrings.mr | typingsSlinky.materialUiSystem.materialUiSystemStrings.mb | typingsSlinky.materialUiSystem.materialUiSystemStrings.ml | typingsSlinky.materialUiSystem.materialUiSystemStrings.mx | typingsSlinky.materialUiSystem.materialUiSystemStrings.my | typingsSlinky.materialUiSystem.materialUiSystemStrings.p | typingsSlinky.materialUiSystem.materialUiSystemStrings.pt | typingsSlinky.materialUiSystem.materialUiSystemStrings.pr | typingsSlinky.materialUiSystem.materialUiSystemStrings.pb | typingsSlinky.materialUiSystem.materialUiSystemStrings.pl | typingsSlinky.materialUiSystem.materialUiSystemStrings.px | typingsSlinky.materialUiSystem.materialUiSystemStrings.py | typingsSlinky.materialUiSystem.materialUiSystemStrings.margin | typingsSlinky.materialUiSystem.materialUiSystemStrings.marginTop | typingsSlinky.materialUiSystem.materialUiSystemStrings.marginRight | typingsSlinky.materialUiSystem.materialUiSystemStrings.marginBottom | typingsSlinky.materialUiSystem.materialUiSystemStrings.marginLeft | typingsSlinky.materialUiSystem.materialUiSystemStrings.marginX | typingsSlinky.materialUiSystem.materialUiSystemStrings.marginY | typingsSlinky.materialUiSystem.materialUiSystemStrings.padding | typingsSlinky.materialUiSystem.materialUiSystemStrings.paddingTop | typingsSlinky.materialUiSystem.materialUiSystemStrings.paddingRight | typingsSlinky.materialUiSystem.materialUiSystemStrings.paddingBottom | typingsSlinky.materialUiSystem.materialUiSystemStrings.paddingLeft | typingsSlinky.materialUiSystem.materialUiSystemStrings.paddingX | typingsSlinky.materialUiSystem.materialUiSystemStrings.paddingY
    ]
  ]
  
  type StyleFunction[Props] = js.Function1[/* props */ Props, js.Any]
  
  type TypographyProps = typingsSlinky.materialUiSystem.mod.PropsFor[
    typingsSlinky.materialUiSystem.mod.SimpleStyleFunction[
      typingsSlinky.materialUiSystem.materialUiSystemStrings.fontFamily | typingsSlinky.materialUiSystem.materialUiSystemStrings.fontSize | typingsSlinky.materialUiSystem.materialUiSystemStrings.fontStyle | typingsSlinky.materialUiSystem.materialUiSystemStrings.fontWeight | typingsSlinky.materialUiSystem.materialUiSystemStrings.letterSpacing | typingsSlinky.materialUiSystem.materialUiSystemStrings.lineHeight | typingsSlinky.materialUiSystem.materialUiSystemStrings.textAlign
    ]
  ]
}
