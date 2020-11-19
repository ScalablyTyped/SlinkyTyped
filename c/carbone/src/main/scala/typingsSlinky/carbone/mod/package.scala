package typingsSlinky.carbone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ConvertCallback = js.Function2[
    /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
    /* result */ typingsSlinky.node.Buffer, 
    scala.Unit
  ]
  
  type CurrencyRates = org.scalablytyped.runtime.StringDictionary[scala.Double]
  
  type Enums = org.scalablytyped.runtime.StringDictionary[
    js.Array[java.lang.String] | org.scalablytyped.runtime.StringDictionary[java.lang.String]
  ]
  
  type Formatter = js.ThisFunction2[
    /* this */ typingsSlinky.carbone.mod.FormatterContext, 
    /* data */ js.Any, 
    /* repeated */ js.Any, 
    scala.Unit
  ]
  
  type Formatters = org.scalablytyped.runtime.StringDictionary[typingsSlinky.carbone.mod.Formatter]
  
  type RenderCallback = js.Function3[
    /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
    /* result */ typingsSlinky.node.Buffer | java.lang.String, 
    /* reportName */ java.lang.String, 
    scala.Unit
  ]
  
  type RenderXMLCallback = js.Function2[
    /* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, 
    /* xmlResult */ java.lang.String, 
    scala.Unit
  ]
  
  type Translations = org.scalablytyped.runtime.StringDictionary[org.scalablytyped.runtime.StringDictionary[java.lang.String]]
  
  type VoidCallback = js.Function1[/* err */ typingsSlinky.node.NodeJS.ErrnoException | scala.Null, scala.Unit]
}
