package typingsSlinky.fastDashGlob

import typingsSlinky.fastDashGlob.fastDashGlobMod.EntryObjectModePredicate
import typingsSlinky.fastDashGlob.fastDashGlobMod.EntryObjectPredicate
import typingsSlinky.fastDashGlob.fastDashGlobMod.EntryStatsPredicate
import typingsSlinky.fastDashGlob.fastDashGlobMod.Task
import typingsSlinky.node.NodeJS.ReadableStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("fast-glob", JSImport.Namespace)
@js.native
object fastDashGlobMod extends js.Object {
  def apply(source: js.Array[typingsSlinky.fastDashGlob.outTypesMod.Pattern]): js.Promise[js.Array[String]] = js.native
  def apply(
    source: js.Array[typingsSlinky.fastDashGlob.outTypesMod.Pattern],
    options: (typingsSlinky.fastDashGlob.outSettingsMod.Options with EntryObjectPredicate) | typingsSlinky.fastDashGlob.outSettingsMod.Options
  ): js.Promise[js.Array[typingsSlinky.fastDashGlob.outTypesMod.Entry]] = js.native
  def apply(source: typingsSlinky.fastDashGlob.outTypesMod.Pattern): js.Promise[js.Array[String]] = js.native
  def apply(
    source: typingsSlinky.fastDashGlob.outTypesMod.Pattern,
    options: (typingsSlinky.fastDashGlob.outSettingsMod.Options with EntryObjectPredicate) | typingsSlinky.fastDashGlob.outSettingsMod.Options
  ): js.Promise[js.Array[typingsSlinky.fastDashGlob.outTypesMod.Entry]] = js.native
  def generateTasks(source: js.Array[typingsSlinky.fastDashGlob.outTypesMod.Pattern]): js.Array[Task] = js.native
  def generateTasks(
    source: js.Array[typingsSlinky.fastDashGlob.outTypesMod.Pattern],
    options: typingsSlinky.fastDashGlob.outSettingsMod.Options
  ): js.Array[Task] = js.native
  def generateTasks(source: typingsSlinky.fastDashGlob.outTypesMod.Pattern): js.Array[Task] = js.native
  def generateTasks(
    source: typingsSlinky.fastDashGlob.outTypesMod.Pattern,
    options: typingsSlinky.fastDashGlob.outSettingsMod.Options
  ): js.Array[Task] = js.native
  def stream(source: js.Array[typingsSlinky.fastDashGlob.outTypesMod.Pattern]): ReadableStream = js.native
  def stream(
    source: js.Array[typingsSlinky.fastDashGlob.outTypesMod.Pattern],
    options: typingsSlinky.fastDashGlob.outSettingsMod.Options
  ): ReadableStream = js.native
  def stream(source: typingsSlinky.fastDashGlob.outTypesMod.Pattern): ReadableStream = js.native
  def stream(
    source: typingsSlinky.fastDashGlob.outTypesMod.Pattern,
    options: typingsSlinky.fastDashGlob.outSettingsMod.Options
  ): ReadableStream = js.native
  def sync(source: js.Array[typingsSlinky.fastDashGlob.outTypesMod.Pattern]): js.Array[String] = js.native
  def sync(
    source: js.Array[typingsSlinky.fastDashGlob.outTypesMod.Pattern],
    options: (typingsSlinky.fastDashGlob.outSettingsMod.Options with EntryObjectPredicate) | typingsSlinky.fastDashGlob.outSettingsMod.Options
  ): js.Array[typingsSlinky.fastDashGlob.outTypesMod.Entry] = js.native
  def sync(source: typingsSlinky.fastDashGlob.outTypesMod.Pattern): js.Array[String] = js.native
  def sync(
    source: typingsSlinky.fastDashGlob.outTypesMod.Pattern,
    options: (typingsSlinky.fastDashGlob.outSettingsMod.Options with EntryObjectPredicate) | typingsSlinky.fastDashGlob.outSettingsMod.Options
  ): js.Array[typingsSlinky.fastDashGlob.outTypesMod.Entry] = js.native
  type Entry = typingsSlinky.fastDashGlob.outTypesMod.Entry
  type EntryObjectModePredicate = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'objectMode'> ]: -? true}
    */ typingsSlinky.fastDashGlob.fastDashGlobStrings.EntryObjectModePredicate with js.Any
  type EntryObjectPredicate = EntryObjectModePredicate | EntryStatsPredicate
  type EntryStatsPredicate = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof std.Pick<fast-glob.fast-glob/out/settings.Options, 'stats'> ]: -? true}
    */ typingsSlinky.fastDashGlob.fastDashGlobStrings.EntryStatsPredicate with js.Any
  type FileSystemAdapter = typingsSlinky.fastDashGlob.outTypesMod.FileSystemAdapter
  type Options = typingsSlinky.fastDashGlob.outSettingsMod.Options
  type Pattern = typingsSlinky.fastDashGlob.outTypesMod.Pattern
  type Task = typingsSlinky.fastDashGlob.outManagersTasksMod.Task
}

