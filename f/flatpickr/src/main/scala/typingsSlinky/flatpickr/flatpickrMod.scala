package typingsSlinky.flatpickr

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.flatpickr.distTypesInstanceMod.FlatpickrFn
import typingsSlinky.flatpickr.distTypesLocaleMod.key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("flatpickr", JSImport.Namespace)
@js.native
object flatpickrMod extends js.Object {
  @js.native
  object default extends TopLevel[FlatpickrFn]
  
  @js.native
  object flatpickr extends js.Object {
    @js.native
    object Options extends js.Object {
      type DateLimit = typingsSlinky.flatpickr.distTypesOptionsMod.DateLimit[typingsSlinky.flatpickr.distTypesOptionsMod.DateOption]
      type DateOption = typingsSlinky.flatpickr.distTypesOptionsMod.DateOption
      type DateRangeLimit = typingsSlinky.flatpickr.distTypesOptionsMod.DateRangeLimit[typingsSlinky.flatpickr.distTypesOptionsMod.DateOption]
      type Hook = typingsSlinky.flatpickr.distTypesOptionsMod.Hook
      type HookKey = typingsSlinky.flatpickr.distTypesOptionsMod.HookKey
      type LocaleKey = key
      type Options = typingsSlinky.flatpickr.distTypesOptionsMod.Options
      type ParsedOptions = typingsSlinky.flatpickr.distTypesOptionsMod.ParsedOptions
      type Plugin = typingsSlinky.flatpickr.distTypesOptionsMod.Plugin[js.Object]
    }
    
    type CustomLocale = typingsSlinky.flatpickr.distTypesLocaleMod.CustomLocale
    type Instance = typingsSlinky.flatpickr.distTypesInstanceMod.Instance
    type Locale = typingsSlinky.flatpickr.distTypesLocaleMod.Locale
  }
  
}

