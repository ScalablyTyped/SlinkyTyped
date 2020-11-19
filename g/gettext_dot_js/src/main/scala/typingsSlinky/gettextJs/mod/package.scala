package typingsSlinky.gettextJs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type GettextStatic = js.Function1[
    /* options */ js.UndefOr[typingsSlinky.gettextJs.mod.GettextOptions], 
    typingsSlinky.gettextJs.mod.Gettext
  ]
  
  type JsonDataMessages = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | js.Array[java.lang.String] | typingsSlinky.gettextJs.mod.JsonDataHeader
  ]
  
  type PluralForm = js.Function1[/* n */ scala.Double, scala.Double]
}
