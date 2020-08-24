package typingsSlinky.aceBuilds.mod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalajs.dom.raw.Document
import typingsSlinky.aceBuilds.mod.Ace.SyntaxMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ace-builds", "EditSession")
@js.native
class EditSession protected ()
  extends typingsSlinky.aceBuilds.mod.Ace.EditSession {
  def this(text: String) = this()
  def this(text: Document) = this()
  def this(text: String, mode: SyntaxMode) = this()
  def this(text: Document, mode: SyntaxMode) = this()
}

@JSImport("ace-builds", "EditSession")
@js.native
object EditSession
  extends Instantiable1[
      (/* text */ Document) | (/* text */ String), 
      typingsSlinky.aceBuilds.mod.Ace.EditSession
    ]
     with Instantiable2[
      (/* text */ Document) | (/* text */ String), 
      /* mode */ SyntaxMode, 
      typingsSlinky.aceBuilds.mod.Ace.EditSession
    ]

