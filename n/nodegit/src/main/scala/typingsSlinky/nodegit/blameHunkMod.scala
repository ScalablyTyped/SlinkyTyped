package typingsSlinky.nodegit

import typingsSlinky.nodegit.oidMod.Oid
import typingsSlinky.nodegit.signatureMod.Signature
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodegit/blame-hunk", JSImport.Namespace)
@js.native
object blameHunkMod extends js.Object {
  
  @js.native
  class BlameHunk () extends js.Object {
    
    var finalCommitId: Oid = js.native
    
    var finalSignature: Signature = js.native
    
    var finalStartLineNumber: Double = js.native
    
    var linesInHunk: Double = js.native
    
    var origCommitId: Oid = js.native
    
    var origPath: String = js.native
    
    var origSignature: Signature = js.native
    
    var origStartLineNumber: Double = js.native
  }
}
