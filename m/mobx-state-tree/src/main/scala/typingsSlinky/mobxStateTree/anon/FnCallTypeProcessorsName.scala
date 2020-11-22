package typingsSlinky.mobxStateTree.anon

import typingsSlinky.mobxStateTree.snapshotProcessorMod.ISnapshotProcessor
import typingsSlinky.mobxStateTree.snapshotProcessorMod.ISnapshotProcessors
import typingsSlinky.mobxStateTree.typeMod.IAnyType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FnCallTypeProcessorsName extends js.Object {
  
  def apply[IT /* <: IAnyType */, CustomC, CustomS](
    `type`: IT,
    processors: ISnapshotProcessors[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
      CustomC, 
      /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
      CustomS
    ]
  ): ISnapshotProcessor[IT, CustomC, CustomS] = js.native
  def apply[IT /* <: IAnyType */, CustomC, CustomS](
    `type`: IT,
    processors: ISnapshotProcessors[
      /* import warning: importer.ImportType#apply Failed type conversion: IT['CreationType'] */ js.Any, 
      CustomC, 
      /* import warning: importer.ImportType#apply Failed type conversion: IT['SnapshotType'] */ js.Any, 
      CustomS
    ],
    name: String
  ): ISnapshotProcessor[IT, CustomC, CustomS] = js.native
}
