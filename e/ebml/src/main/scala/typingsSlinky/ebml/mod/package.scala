package typingsSlinky.ebml

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type StateAndTagData = js.Tuple2[
    typingsSlinky.ebml.ebmlStrings.tag | typingsSlinky.ebml.ebmlStrings.start | typingsSlinky.ebml.ebmlStrings.end, 
    typingsSlinky.ebml.mod.Tag[js.Any] | typingsSlinky.ebml.mod.TagMetadata
  ]
  
  @scala.inline
  def schema: typingsSlinky.std.Map[scala.Double, typingsSlinky.ebml.mod.EBMLTagSchema] = typingsSlinky.ebml.mod.^.asInstanceOf[js.Dynamic].selectDynamic("schema").asInstanceOf[typingsSlinky.std.Map[scala.Double, typingsSlinky.ebml.mod.EBMLTagSchema]]
}
