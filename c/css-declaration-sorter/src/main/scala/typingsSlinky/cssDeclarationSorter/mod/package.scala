package typingsSlinky.cssDeclarationSorter

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * Default, order in a simple alphabetical manner from a - z.
    */
  type Alphabetical = typingsSlinky.cssDeclarationSorter.cssDeclarationSorterStrings.alphabetical
  /**
    * Order properties applying outside the box model, moving inward to intrinsic changes.
    * ```
    * 1. Positioning
    * 2. Visibility
    * 3. Box model
    * 4. Dimensions
    * 5. Text
    * ```
    */
  type ConcentricCSS = typingsSlinky.cssDeclarationSorter.cssDeclarationSorterStrings.`concentric-css`
  type CssDeclarationSorter = typingsSlinky.postcss.mod.Plugin_[typingsSlinky.cssDeclarationSorter.mod.Options]
  /**
    * Order from most important, flow affecting properties, to least important properties.
    * ```
    * 1. Box
    * 2. Border
    * 3. Background
    * 4. Text
    * 5. Other
    * ```
    */
  type SMACSS = typingsSlinky.cssDeclarationSorter.cssDeclarationSorterStrings.smacss
  /**
    * This function receives two declaration names and is expected
    * to return -1, 0 or 1 depending on the wanted order.
    */
  type SortFunction = js.Function2[
    /* aProp */ java.lang.String, 
    /* bProp */ java.lang.String, 
    typingsSlinky.cssDeclarationSorter.cssDeclarationSorterNumbers.`-1` | typingsSlinky.cssDeclarationSorter.cssDeclarationSorterNumbers.`0` | typingsSlinky.cssDeclarationSorter.cssDeclarationSorterNumbers.`1`
  ]
  type SortOrder = typingsSlinky.cssDeclarationSorter.mod.Alphabetical | typingsSlinky.cssDeclarationSorter.mod.SMACSS | typingsSlinky.cssDeclarationSorter.mod.ConcentricCSS
}
