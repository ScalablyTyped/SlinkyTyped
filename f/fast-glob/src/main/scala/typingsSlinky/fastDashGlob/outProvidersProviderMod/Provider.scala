package typingsSlinky.fastDashGlob.outProvidersProviderMod

import typingsSlinky.fastDashGlob.outManagersTasksMod.Task
import typingsSlinky.fastDashGlob.outTypesMod.MicromatchOptions
import typingsSlinky.fastDashGlob.outTypesMod.ReaderOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Provider[T] extends js.Object {
  val _settings: typingsSlinky.fastDashGlob.outSettingsMod.default
  val deepFilter: typingsSlinky.fastDashGlob.outProvidersFiltersDeepMod.default
  val entryFilter: typingsSlinky.fastDashGlob.outProvidersFiltersEntryMod.default
  val entryTransformer: typingsSlinky.fastDashGlob.outProvidersTransformersEntryMod.default
  val errorFilter: typingsSlinky.fastDashGlob.outProvidersFiltersErrorMod.default
  /* protected */ def _getMicromatchOptions(): MicromatchOptions
  /* protected */ def _getReaderOptions(task: Task): ReaderOptions
  /* protected */ def _getRootDirectory(task: Task): String
  def read(_task: Task): T
}

object Provider {
  @scala.inline
  def apply[T](
    _getMicromatchOptions: () => MicromatchOptions,
    _getReaderOptions: Task => ReaderOptions,
    _getRootDirectory: Task => String,
    _settings: typingsSlinky.fastDashGlob.outSettingsMod.default,
    deepFilter: typingsSlinky.fastDashGlob.outProvidersFiltersDeepMod.default,
    entryFilter: typingsSlinky.fastDashGlob.outProvidersFiltersEntryMod.default,
    entryTransformer: typingsSlinky.fastDashGlob.outProvidersTransformersEntryMod.default,
    errorFilter: typingsSlinky.fastDashGlob.outProvidersFiltersErrorMod.default,
    read: Task => T
  ): Provider[T] = {
    val __obj = js.Dynamic.literal(_getMicromatchOptions = js.Any.fromFunction0(_getMicromatchOptions), _getReaderOptions = js.Any.fromFunction1(_getReaderOptions), _getRootDirectory = js.Any.fromFunction1(_getRootDirectory), _settings = _settings.asInstanceOf[js.Any], deepFilter = deepFilter.asInstanceOf[js.Any], entryFilter = entryFilter.asInstanceOf[js.Any], entryTransformer = entryTransformer.asInstanceOf[js.Any], errorFilter = errorFilter.asInstanceOf[js.Any], read = js.Any.fromFunction1(read))
  
    __obj.asInstanceOf[Provider[T]]
  }
}

