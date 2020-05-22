package typingsSlinky.reactMedia

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  /**
    * The type of the `queries` prop
    */
  type MediaQueries = org.scalablytyped.runtime.StringDictionary[typingsSlinky.reactMedia.mod.MediaQueryValue]
  type MediaQueryObject = org.scalablytyped.runtime.StringDictionary[scala.Boolean | scala.Double | java.lang.String]
  /**
    * All allowed forms of media query inputs
    */
  type MediaQueryValue = java.lang.String | typingsSlinky.reactMedia.mod.MediaQueryObject | js.Array[typingsSlinky.reactMedia.mod.MediaQueryObject]
  /**
    * The type of returned `matches` in case the `queries` prop is provided. The keys on `matches`
    * are inferred from the shape of `queries`.
    *
    * @example
    *
    * <Media queries={{ small: '...', medium: '...' }}>{
    *   // matches: { small: boolean, medium: boolean }
    *   matches => {}
    * }</Media>
    */
  type QueryResults[Queries] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ key in keyof Queries ]: boolean}
    */ typingsSlinky.reactMedia.reactMediaStrings.QueryResults with org.scalablytyped.runtime.TopLevel[js.Any]
}
