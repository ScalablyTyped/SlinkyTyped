package typingsSlinky

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object fancybox {
  
  type FancyBoxInteractionMethod = js.Function2[
    /* slide */ js.UndefOr[typingsSlinky.fancybox.FancyBoxSlide], 
    /* event */ js.UndefOr[typingsSlinky.jquery.JQuery.Event], 
    typingsSlinky.fancybox.FancyBoxInteractionTypes
  ]
  
  type FancyBoxInteractions = typingsSlinky.fancybox.FancyBoxInteractionTypes | typingsSlinky.fancybox.FancyBoxInteractionMethod
  
  type FancyBoxInternationalizationOptions = org.scalablytyped.runtime.StringDictionary[typingsSlinky.fancybox.FancyBoxInternationalizatioObject]
  
  type FancyBoxPlainObject = org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Double | scala.Boolean | js.Function0[scala.Unit]]
}
