package typingsSlinky.archiver

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type ArchiverOptions = typingsSlinky.archiver.mod.CoreOptions with typingsSlinky.archiver.mod.TransformOptions with typingsSlinky.archiver.mod.ZipOptions with typingsSlinky.archiver.mod.TarOptions
  
  /** A function that lets you either opt out of including an entry (by returning false), or modify the contents of an entry as it is added (by returning an EntryData) */
  type EntryDataFunction = js.Function1[
    /* entry */ typingsSlinky.archiver.mod.EntryData, 
    typingsSlinky.archiver.archiverBooleans.`false` | typingsSlinky.archiver.mod.EntryData
  ]
  
  type Partial[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]:? T[P]}
    */ typingsSlinky.archiver.archiverStrings.Partial with org.scalablytyped.runtime.TopLevel[T]
  
  type TarEntryData = typingsSlinky.archiver.mod.EntryData
}
