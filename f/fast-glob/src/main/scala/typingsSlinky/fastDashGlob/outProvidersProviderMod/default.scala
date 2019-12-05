package typingsSlinky.fastDashGlob.outProvidersProviderMod

import typingsSlinky.fastDashGlob.outManagersTasksMod.Task
import typingsSlinky.fastDashGlob.outTypesMod.MicromatchOptions
import typingsSlinky.fastDashGlob.outTypesMod.ReaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob/out/providers/provider", JSImport.Default)
@js.native
abstract class default[T] protected () extends Provider[T] {
  def this(_settings: typingsSlinky.fastDashGlob.outSettingsMod.default) = this()
  /* CompleteClass */
  override val _settings: typingsSlinky.fastDashGlob.outSettingsMod.default = js.native
  /* CompleteClass */
  override val deepFilter: typingsSlinky.fastDashGlob.outProvidersFiltersDeepMod.default = js.native
  /* CompleteClass */
  override val entryFilter: typingsSlinky.fastDashGlob.outProvidersFiltersEntryMod.default = js.native
  /* CompleteClass */
  override val entryTransformer: typingsSlinky.fastDashGlob.outProvidersTransformersEntryMod.default = js.native
  /* CompleteClass */
  override val errorFilter: typingsSlinky.fastDashGlob.outProvidersFiltersErrorMod.default = js.native
  /* CompleteClass */
  /* protected */ override def _getMicromatchOptions(): MicromatchOptions = js.native
  /* CompleteClass */
  /* protected */ override def _getReaderOptions(task: Task): ReaderOptions = js.native
  /* CompleteClass */
  /* protected */ override def _getRootDirectory(task: Task): String = js.native
  /* CompleteClass */
  override def read(_task: Task): T = js.native
}

