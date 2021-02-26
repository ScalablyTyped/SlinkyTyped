package typingsSlinky.ipldBlock

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Represents an immutable block of data that is uniquely referenced with a cid.
    *
    * @example
    * const block = new Block(Uint8Array.from([0, 1, 2, 3]), new CID('...'))
    */
  @JSImport("ipld-block/dist/src", JSImport.Namespace)
  @js.native
  class ^ protected () extends Block {
    /**
      * @param {Uint8Array} data - The data to be stored in the block as a Uint8Array.
      * @param {CID} cid - The cid of the data
      */
    def this(data: js.typedarray.Uint8Array, cid: typingsSlinky.cids.mod.^) = this()
  }
  
  /**
    * Check if the given value is a Block.
    *
    * @param {any} other
    * @returns {other is Block}
    */
  /* static member */
  @JSImport("ipld-block/dist/src", "isBlock")
  @js.native
  def isBlock(other: js.Any): /* is ipld-block.ipld-block/dist/src.Block */ Boolean = js.native
  
  /**
    * Represents an immutable block of data that is uniquely referenced with a cid.
    *
    * @example
    * const block = new Block(Uint8Array.from([0, 1, 2, 3]), new CID('...'))
    */
  @js.native
  trait Block extends StObject {
    
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
}
