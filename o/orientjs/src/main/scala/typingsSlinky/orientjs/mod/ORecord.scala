package typingsSlinky.orientjs.mod

import typingsSlinky.node.Buffer
import typingsSlinky.orientjs.orientjsStrings.b
import typingsSlinky.orientjs.orientjsStrings.d
import typingsSlinky.std.Object
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("orientjs", "ORecord")
@js.native
class ORecord () extends Object {
  
  var `@class`: js.UndefOr[String] = js.native
  
  var `@rid`: js.UndefOr[ORID] = js.native
  
  var `@type`: js.UndefOr[d | b] = js.native
  
  var `@version`: js.UndefOr[Version] = js.native
  
  /**
    * Insert the given record into the database.
    *
    * @param  record  The record to insert.
    * @param  options The command options.
    * @promise {Object}        The inserted record.
    */
  def create(record: BinaryRecord | ODocument | ORecord): js.Promise[ORecord] = js.native
  def create(record: BinaryRecord | ODocument | ORecord, options: js.Any): js.Promise[ORecord] = js.native
  /**
    * Insert the given record into the database.
    *
    * @param  record  The record to insert.
    * @param  options The command options.
    * @promise {Object}        The inserted record.
    */
  def create(records: js.Array[BinaryRecord | ODocument | ORecord]): js.Promise[js.Array[ORecord]] = js.native
  def create(records: js.Array[BinaryRecord | ODocument | ORecord], options: js.Any): js.Promise[js.Array[ORecord]] = js.native
  
  def delete(): js.Promise[ORecord] = js.native
  def delete(record: ORID): js.Promise[ORecord] = js.native
  def delete(record: ORID, options: js.Any): js.Promise[ORecord] = js.native
  /**
    * Delete the given record.
    *
    * @param   record  The record or record id to delete.
    * @param              options The query options.
    * @promise {Object}                    The deleted record object.
    */
  def delete(record: ORecord): js.Promise[ORecord] = js.native
  def delete(record: ORecord, options: js.Any): js.Promise[ORecord] = js.native
  
  /**
    * Read the given record.
    *
    * @param  records  The record to load.
    * @param  options The query options.
    * @promise {Object[]}        The loaded record.
    */
  def get(records: js.Array[ORID | ORecord]): js.Promise[js.Array[Buffer | ORecord]] = js.native
  def get(records: js.Array[ORID | ORecord], options: js.Any): js.Promise[js.Array[Buffer | ORecord]] = js.native
  def get(record: ORID): js.Promise[ORecord | Buffer] = js.native
  def get(record: ORID, options: js.Any): js.Promise[ORecord | Buffer] = js.native
  /**
    * Read the given record.
    *
    * @param  record  The record to load.
    * @param  options The query options.
    * @promise {Object}        The loaded record.
    */
  def get(record: ORecord): js.Promise[ORecord | Buffer] = js.native
  def get(record: ORecord, options: js.Any): js.Promise[ORecord | Buffer] = js.native
  
  def meta(record: String): js.Promise[RecordMeta] = js.native
  def meta(record: String, options: js.Any): js.Promise[RecordMeta] = js.native
  /**
    * Read the metadata for the given record.
    *
    * @param  record  The record to load.
    * @param  options The query options.
    * @promise {Object}        The record object with loaded meta data.
    */
  def meta(records: js.Array[ORID | ORecord]): js.Promise[js.Array[RecordMeta]] = js.native
  def meta(records: js.Array[ORID | ORecord], options: js.Any): js.Promise[js.Array[RecordMeta]] = js.native
  def meta(record: ORID): js.Promise[RecordMeta] = js.native
  def meta(record: ORID, options: js.Any): js.Promise[RecordMeta] = js.native
  /**
    * Read the metadata for the given record.
    *
    * @param  record  The record to load.
    * @param  options The query options.
    * @promise {Object}        The record object with loaded meta data.
    */
  def meta(record: ORecord): js.Promise[RecordMeta] = js.native
  def meta(record: ORecord, options: js.Any): js.Promise[RecordMeta] = js.native
  
  /**
    * Resolve all references within the given collection of records.
    *
    * @param  records  The records to resolve.
    * @return            The records with references replaced.
    */
  def resolveReferences(records: js.Array[ORecord]): js.Array[ORecord] = js.native
  
  var rid: js.UndefOr[ORID] = js.native
  
  /**
    * Update the given record.
    *
    * @param  record  The record to update.
    * @param  options The query options.
    * @promise {Object}        The updated record.
    */
  def update(): js.Promise[ORecord] = js.native
  def update(record: js.UndefOr[scala.Nothing], options: js.Any): js.Promise[ORecord] = js.native
  def update(record: ORID): js.Promise[ORecord] = js.native
  def update(record: ORID, options: js.Any): js.Promise[ORecord] = js.native
  def update(record: ORecord): js.Promise[ORecord] = js.native
  def update(record: ORecord, options: js.Any): js.Promise[ORecord] = js.native
}
