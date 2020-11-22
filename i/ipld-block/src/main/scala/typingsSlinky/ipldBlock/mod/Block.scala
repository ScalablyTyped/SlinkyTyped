package typingsSlinky.ipldBlock.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents an immutable block of data that is uniquely referenced with a cid.
  *
  * @example
  * const block = new Block(Uint8Array.from([0, 1, 2, 3]), new CID('...'))
  */
@js.native
trait Block extends js.Object {
  
  /**
    * The cid of the data this block represents.
    *
    * @deprecated
    * @type {CID}
    */
  def _cid: typingsSlinky.cids.mod.^ = js.native
  
  /**
    * The data of this block.
    *
    * @deprecated
    * @type {Uint8Array}
    */
  def _data: js.typedarray.Uint8Array = js.native
  
  var cid: typingsSlinky.cids.mod.^ = js.native
  
  var data: js.typedarray.Uint8Array = js.native
  
  var get: js.Any = js.native
  
  @JSName(js.Symbol.toStringTag)
  var toStringTag: js.Function0[String] = js.native
}
