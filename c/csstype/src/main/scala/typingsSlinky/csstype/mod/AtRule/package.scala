package typingsSlinky.csstype.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object AtRule {
  
  type FontFeatureSettings = typingsSlinky.csstype.csstypeStrings.normal | (java.lang.String with js.Object)
  
  type FontStretch = typingsSlinky.csstype.mod.DataType.FontStretchAbsolute | (java.lang.String with js.Object)
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.csstypeStrings.italic
    - typingsSlinky.csstype.csstypeStrings.normal
    - typingsSlinky.csstype.csstypeStrings.oblique
    - java.lang.String with js.Object
  */
  type FontStyle = typingsSlinky.csstype.mod.AtRule._FontStyle | (java.lang.String with js.Object)
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.mod.DataType.EastAsianVariantValues
    - typingsSlinky.csstype.csstypeStrings.`all-petite-caps`
    - typingsSlinky.csstype.csstypeStrings.`all-small-caps`
    - typingsSlinky.csstype.csstypeStrings.`common-ligatures`
    - typingsSlinky.csstype.csstypeStrings.contextual
    - typingsSlinky.csstype.csstypeStrings.`diagonal-fractions`
    - typingsSlinky.csstype.csstypeStrings.`discretionary-ligatures`
    - typingsSlinky.csstype.csstypeStrings.`full-width`
    - typingsSlinky.csstype.csstypeStrings.`historical-forms`
    - typingsSlinky.csstype.csstypeStrings.`historical-ligatures`
    - typingsSlinky.csstype.csstypeStrings.`lining-nums`
    - typingsSlinky.csstype.csstypeStrings.`no-common-ligatures`
    - typingsSlinky.csstype.csstypeStrings.`no-contextual`
    - typingsSlinky.csstype.csstypeStrings.`no-discretionary-ligatures`
    - typingsSlinky.csstype.csstypeStrings.`no-historical-ligatures`
    - typingsSlinky.csstype.csstypeStrings.none
    - typingsSlinky.csstype.csstypeStrings.normal
    - typingsSlinky.csstype.csstypeStrings.`oldstyle-nums`
    - typingsSlinky.csstype.csstypeStrings.ordinal
    - typingsSlinky.csstype.csstypeStrings.`petite-caps`
    - typingsSlinky.csstype.csstypeStrings.`proportional-nums`
    - typingsSlinky.csstype.csstypeStrings.`proportional-width`
    - typingsSlinky.csstype.csstypeStrings.ruby
    - typingsSlinky.csstype.csstypeStrings.`slashed-zero`
    - typingsSlinky.csstype.csstypeStrings.`small-caps`
    - typingsSlinky.csstype.csstypeStrings.`stacked-fractions`
    - typingsSlinky.csstype.csstypeStrings.`tabular-nums`
    - typingsSlinky.csstype.csstypeStrings.`titling-caps`
    - typingsSlinky.csstype.csstypeStrings.unicase
    - java.lang.String with js.Object
  */
  type FontVariant = typingsSlinky.csstype.mod.AtRule._FontVariant | (java.lang.String with js.Object)
  
  type FontVariationSettings = typingsSlinky.csstype.csstypeStrings.normal | (java.lang.String with js.Object)
  
  type FontWeight = typingsSlinky.csstype.mod.DataType.FontWeightAbsolute | (java.lang.String with js.Object)
  
  type Height[TLength] = typingsSlinky.csstype.mod.DataType.ViewportLength[TLength] | (java.lang.String with js.Object)
  
  type MaxHeight[TLength] = typingsSlinky.csstype.mod.DataType.ViewportLength[TLength]
  
  type MaxWidth[TLength] = typingsSlinky.csstype.mod.DataType.ViewportLength[TLength]
  
  type MaxZoom = typingsSlinky.csstype.csstypeStrings.auto | (java.lang.String with js.Object) | (scala.Double with js.Object)
  
  type MinHeight[TLength] = typingsSlinky.csstype.mod.DataType.ViewportLength[TLength]
  
  type MinWidth[TLength] = typingsSlinky.csstype.mod.DataType.ViewportLength[TLength]
  
  type MinZoom = typingsSlinky.csstype.csstypeStrings.auto | (java.lang.String with js.Object) | (scala.Double with js.Object)
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.csstypeStrings.auto
    - typingsSlinky.csstype.csstypeStrings.infinite
    - java.lang.String with js.Object
    - scala.Double with js.Object
  */
  type Range = typingsSlinky.csstype.mod.AtRule._Range | (java.lang.String with js.Object) | (scala.Double with js.Object)
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.csstypeStrings.auto
    - typingsSlinky.csstype.csstypeStrings.bullets
    - typingsSlinky.csstype.csstypeStrings.numbers
    - typingsSlinky.csstype.csstypeStrings.`spell-out`
    - typingsSlinky.csstype.csstypeStrings.words
    - java.lang.String with js.Object
  */
  type SpeakAs = typingsSlinky.csstype.mod.AtRule._SpeakAs | (java.lang.String with js.Object)
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.csstype.csstypeStrings.additive
    - typingsSlinky.csstype.csstypeStrings.alphabetic
    - typingsSlinky.csstype.csstypeStrings.cyclic
    - typingsSlinky.csstype.csstypeStrings.fixed
    - typingsSlinky.csstype.csstypeStrings.numeric
    - typingsSlinky.csstype.csstypeStrings.symbolic
    - java.lang.String with js.Object
  */
  type System = typingsSlinky.csstype.mod.AtRule._System | (java.lang.String with js.Object)
  
  type Width[TLength] = typingsSlinky.csstype.mod.DataType.ViewportLength[TLength] | (java.lang.String with js.Object)
  
  type Zoom = typingsSlinky.csstype.csstypeStrings.auto | (java.lang.String with js.Object) | (scala.Double with js.Object)
}
