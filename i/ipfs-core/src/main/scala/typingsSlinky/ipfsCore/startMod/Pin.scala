package typingsSlinky.ipfsCore.startMod

import typingsSlinky.ipfsCore.addMod.AddOptions
import typingsSlinky.ipfsCore.pinAddAllMod.AddSettings
import typingsSlinky.ipfsCore.pinLsMod.LsEntry
import typingsSlinky.ipfsCore.pinLsMod.LsSettings
import typingsSlinky.ipfsCore.pinRmMod.RmSettings
import typingsSlinky.ipfsCore.srcUtilsMod.AbortOptions
import typingsSlinky.std.AsyncIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Pin extends js.Object {
  
  def add(path: String): js.Promise[typingsSlinky.cids.mod.^] = js.native
  def add(path: String, options: AddOptions with AbortOptions): js.Promise[typingsSlinky.cids.mod.^] = js.native
  def add(path: typingsSlinky.cids.mod.^): js.Promise[typingsSlinky.cids.mod.^] = js.native
  def add(path: typingsSlinky.cids.mod.^, options: AddOptions with AbortOptions): js.Promise[typingsSlinky.cids.mod.^] = js.native
  
  def addAll(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ js.Any
  ): AsyncIterable[typingsSlinky.cids.mod.^] = js.native
  def addAll(
    source: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify imported_normalise-input.Source */ js.Any,
    options: AddSettings with AbortOptions
  ): AsyncIterable[typingsSlinky.cids.mod.^] = js.native
  
  def ls(): AsyncIterable[LsEntry] = js.native
  def ls(options: LsSettings with AbortOptions): AsyncIterable[LsEntry] = js.native
  
  def rm(path: String): js.Promise[typingsSlinky.cids.mod.^] = js.native
  def rm(path: String, options: RmSettings with AbortOptions): js.Promise[typingsSlinky.cids.mod.^] = js.native
  def rm(path: typingsSlinky.cids.mod.^): js.Promise[typingsSlinky.cids.mod.^] = js.native
  def rm(path: typingsSlinky.cids.mod.^, options: RmSettings with AbortOptions): js.Promise[typingsSlinky.cids.mod.^] = js.native
}
