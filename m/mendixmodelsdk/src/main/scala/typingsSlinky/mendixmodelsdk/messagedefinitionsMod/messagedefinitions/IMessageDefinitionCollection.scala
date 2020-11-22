package typingsSlinky.mendixmodelsdk.messagedefinitionsMod.messagedefinitions

import typingsSlinky.mendixmodelsdk.instancesMod.IList
import typingsSlinky.mendixmodelsdk.projectsMod.projects.IDocument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * See: {@link https://docs.mendix.com/refguide/message-definitions relevant section in reference guide}
  *
  * In version 7.6.0: introduced
  */
@js.native
trait IMessageDefinitionCollection extends IDocument {
  
  val messageDefinitions: IList[IMessageDefinition] = js.native
}
