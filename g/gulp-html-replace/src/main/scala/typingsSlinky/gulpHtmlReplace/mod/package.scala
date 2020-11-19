package typingsSlinky.gulpHtmlReplace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type HtmlReplace = js.Function2[
    /* tasks */ typingsSlinky.gulpHtmlReplace.mod.Tasks, 
    /* options */ js.UndefOr[typingsSlinky.gulpHtmlReplace.mod.Options], 
    typingsSlinky.node.NodeJS.ReadWriteStream
  ]
  
  type Tasks = org.scalablytyped.runtime.StringDictionary[
    java.lang.String | js.Array[java.lang.String] | typingsSlinky.gulpHtmlReplace.mod.AdvancedTask
  ]
}
