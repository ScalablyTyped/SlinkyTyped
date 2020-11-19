package typingsSlinky.jsmediatags.mp4tagcontentsMod

import typingsSlinky.jsmediatags.typesMod.ByteArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("jsmediatags/build2/MP4TagContents", JSImport.Default)
@js.native
class default protected () extends MP4TagContents {
  def this(ftyp: String) = this()
  def this(ftyp: String, atoms: js.Array[Atom]) = this()
}
/* static members */
@JSImport("jsmediatags/build2/MP4TagContents", JSImport.Default)
@js.native
object default extends js.Object {
  
  def createAtom(atomName: String): Atom = js.native
  
  def createContainerAtom(atomName: String, atoms: js.Array[Atom]): Atom = js.native
  def createContainerAtom(atomName: String, atoms: js.Array[Atom], data: ByteArray): Atom = js.native
  
  def createMetadataAtom(atomName: String, `type`: String, data: ByteArray): Atom = js.native
}
