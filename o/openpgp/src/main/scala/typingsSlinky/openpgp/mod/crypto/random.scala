package typingsSlinky.openpgp.mod.crypto

import typingsSlinky.openpgp.mod.Integer
import typingsSlinky.openpgp.mod.`type`.mpi.MPI
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "crypto.random")
@js.native
object random extends js.Object {
  
  /**
    * Buffer for secure random numbers
    */
  def RandomBuffer(): Unit = js.native
  
  /**
    * Create a secure random MPI that is greater than or equal to min and less than max.
    * @param min Lower bound, included
    * @param max Upper bound, excluded
    * @returns Random MPI
    */
  def getRandomBN(min: MPI, max: MPI): js.Any = js.native
  
  /**
    * Retrieve secure random byte array of the specified length
    * @param length Length in bytes to generate
    * @returns Random byte array
    */
  def getRandomBytes(length: Integer): js.typedarray.Uint8Array = js.native
}
