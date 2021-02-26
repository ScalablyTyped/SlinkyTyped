package typingsSlinky.intlMessageformatParser.srcTypesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait TYPE extends StObject
@JSImport("intl-messageformat-parser/src/types", "TYPE")
@js.native
object TYPE extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[TYPE with Double] = js.native
  
  /**
    * Variable w/o any format, e.g `var` in `this is a {var}`
    */
  @js.native
  sealed trait argument extends TYPE
  /* 1 */ val argument: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.argument with Double = js.native
  
  /**
    * Variable w/ date format
    */
  @js.native
  sealed trait date extends TYPE
  /* 3 */ val date: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.date with Double = js.native
  
  /**
    * Raw text
    */
  @js.native
  sealed trait literal extends TYPE
  /* 0 */ val literal: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.literal with Double = js.native
  
  /**
    * Variable w/ number format
    */
  @js.native
  sealed trait number extends TYPE
  /* 2 */ val number: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.number with Double = js.native
  
  /**
    * Variable w/ plural format
    */
  @js.native
  sealed trait plural extends TYPE
  /* 6 */ val plural: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.plural with Double = js.native
  
  /**
    * Only possible within plural argument.
    * This is the `#` symbol that will be substituted with the count.
    */
  @js.native
  sealed trait pound extends TYPE
  /* 7 */ val pound: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.pound with Double = js.native
  
  /**
    * Variable w/ select format
    */
  @js.native
  sealed trait select extends TYPE
  /* 5 */ val select: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.select with Double = js.native
  
  /**
    * XML-like tag
    */
  @js.native
  sealed trait tag extends TYPE
  /* 8 */ val tag: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.tag with Double = js.native
  
  /**
    * Variable w/ time format
    */
  @js.native
  sealed trait time extends TYPE
  /* 4 */ val time: typingsSlinky.intlMessageformatParser.srcTypesMod.TYPE.time with Double = js.native
}
