package typingsSlinky.ipfsCore.startMod

import typingsSlinky.ipfsCore.blockStatMod.Stat
import typingsSlinky.ipfsCore.blockStatMod.StatOptions
import typingsSlinky.ipfsCore.dagGetMod.GetOptions
import typingsSlinky.ipfsCore.dagPutMod.PutOptions
import typingsSlinky.ipfsCore.pinRmMod.RmOptions
import typingsSlinky.ipfsCore.rmMod.RmFailure
import typingsSlinky.ipfsCore.rmMod.RmSucceess
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Block extends js.Object {
  
  def get(cid: String): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def get(cid: String, options: GetOptions with AbortOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def get(cid: typingsSlinky.cids.mod.^): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def get(cid: typingsSlinky.cids.mod.^, options: GetOptions with AbortOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def get(cid: js.typedarray.Uint8Array): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def get(cid: js.typedarray.Uint8Array, options: GetOptions with AbortOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  
  def put(
    block: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def put(
    block: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ js.Any,
    options: PutOptions with AbortOptions
  ): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def put(block: js.typedarray.Uint8Array): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  def put(block: js.typedarray.Uint8Array, options: PutOptions with AbortOptions): js.Promise[
    /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_src */ _
  ] = js.native
  
  def rm(cids: js.Array[typingsSlinky.cids.mod.^]): AsyncIterable[RmSucceess | RmFailure] = js.native
  def rm(cids: js.Array[typingsSlinky.cids.mod.^], options: RmOptions with AbortOptions): AsyncIterable[RmSucceess | RmFailure] = js.native
  def rm(cids: typingsSlinky.cids.mod.^): AsyncIterable[RmSucceess | RmFailure] = js.native
  def rm(cids: typingsSlinky.cids.mod.^, options: RmOptions with AbortOptions): AsyncIterable[RmSucceess | RmFailure] = js.native
  
  def stat(cid: typingsSlinky.cids.mod.^): js.Promise[Stat] = js.native
  def stat(cid: typingsSlinky.cids.mod.^, options: StatOptions with AbortOptions): js.Promise[Stat] = js.native
}
