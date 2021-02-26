package typingsSlinky.grunt

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * {@link https://github.com/marak/colors.js/}
  */
@js.native
trait String extends StObject {
  
  var blue: java.lang.String = js.native
  
  var cyan: java.lang.String = js.native
  
  var green: java.lang.String = js.native
  
  var grey: java.lang.String = js.native
  
  var magenta: java.lang.String = js.native
  
  var red: java.lang.String = js.native
  
  var white: java.lang.String = js.native
  
  var yellow: java.lang.String = js.native
}
object String {
  
  @scala.inline
  def apply(
    blue: java.lang.String,
    cyan: java.lang.String,
    green: java.lang.String,
    grey: java.lang.String,
    magenta: java.lang.String,
    red: java.lang.String,
    white: java.lang.String,
    yellow: java.lang.String
  ): String = {
    val __obj = js.Dynamic.literal(blue = blue.asInstanceOf[js.Any], cyan = cyan.asInstanceOf[js.Any], green = green.asInstanceOf[js.Any], grey = grey.asInstanceOf[js.Any], magenta = magenta.asInstanceOf[js.Any], red = red.asInstanceOf[js.Any], white = white.asInstanceOf[js.Any], yellow = yellow.asInstanceOf[js.Any])
    __obj.asInstanceOf[String]
  }
  
  @scala.inline
  implicit class StringMutableBuilder[Self <: String] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBlue(value: java.lang.String): Self = StObject.set(x, "blue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCyan(value: java.lang.String): Self = StObject.set(x, "cyan", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreen(value: java.lang.String): Self = StObject.set(x, "green", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGrey(value: java.lang.String): Self = StObject.set(x, "grey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMagenta(value: java.lang.String): Self = StObject.set(x, "magenta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRed(value: java.lang.String): Self = StObject.set(x, "red", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhite(value: java.lang.String): Self = StObject.set(x, "white", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYellow(value: java.lang.String): Self = StObject.set(x, "yellow", value.asInstanceOf[js.Any])
  }
}
