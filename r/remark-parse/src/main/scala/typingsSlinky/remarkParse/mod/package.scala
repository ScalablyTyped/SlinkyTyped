package typingsSlinky.remarkParse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type Parse = typingsSlinky.unified.mod.Plugin[
    js.Array[js.UndefOr[typingsSlinky.remarkParse.mod.RemarkParseOptions]], 
    typingsSlinky.unified.mod.Settings
  ]
  
  type RemarkParseOptions = typingsSlinky.mdastUtilFromMarkdown.mod.Options
}
