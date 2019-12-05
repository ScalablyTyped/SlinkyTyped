package typingsSlinky.atIonicStorage

import typingsSlinky.atAngularCore.atAngularCoreMod.InjectionToken
import typingsSlinky.atAngularCore.atAngularCoreMod.ModuleWithProviders
import typingsSlinky.atIonicStorage.atIonicStorageStorageMod.StorageConfig
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ionic/storage", JSImport.Namespace)
@js.native
object atIonicStorageMod extends js.Object {
  @js.native
  class IonicStorageModule () extends js.Object
  
  @js.native
  class Storage protected ()
    extends typingsSlinky.atIonicStorage.atIonicStorageStorageMod.Storage {
    /**
      * Create a new Storage instance using the order of drivers and any additional config
      * options to pass to LocalForage.
      *
      * Possible driver options are: ['sqlite', 'indexeddb', 'websql', 'localstorage'] and the
      * default is that exact ordering.
      */
    def this(config: StorageConfig) = this()
  }
  
  val StorageConfigToken: InjectionToken[js.Any] = js.native
  def ɵa(storageConfig: StorageConfig): typingsSlinky.atIonicStorage.atIonicStorageStorageMod.Storage = js.native
  /* static members */
  @js.native
  object IonicStorageModule extends js.Object {
    def forRoot(): ModuleWithProviders[_] = js.native
    def forRoot(storageConfig: StorageConfig): ModuleWithProviders[_] = js.native
  }
  
}

