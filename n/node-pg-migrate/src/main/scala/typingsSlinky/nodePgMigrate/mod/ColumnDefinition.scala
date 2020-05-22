package typingsSlinky.nodePgMigrate.mod

import typingsSlinky.nodePgMigrate.anon.precedenceALWAYSBYDEFAULT
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.FULL
import typingsSlinky.nodePgMigrate.nodePgMigrateStrings.SIMPLE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ColumnDefinition extends ReferencesOptions {
  var check: js.UndefOr[String] = js.undefined
  var collation: js.UndefOr[String] = js.undefined
  var comment: js.UndefOr[String | Null] = js.undefined
  var default: js.UndefOr[Value] = js.undefined
  var deferrable: js.UndefOr[Boolean] = js.undefined
  var deferred: js.UndefOr[Boolean] = js.undefined
  var generated: js.UndefOr[precedenceALWAYSBYDEFAULT] = js.undefined
  var notNull: js.UndefOr[Boolean] = js.undefined
  var primaryKey: js.UndefOr[Boolean] = js.undefined
  var `type`: String
  var unique: js.UndefOr[Boolean] = js.undefined
}

object ColumnDefinition {
  @scala.inline
  def apply(
    `type`: String,
    check: String = null,
    collation: String = null,
    comment: js.UndefOr[Null | String] = js.undefined,
    default: js.UndefOr[Null | Value] = js.undefined,
    deferrable: js.UndefOr[Boolean] = js.undefined,
    deferred: js.UndefOr[Boolean] = js.undefined,
    generated: precedenceALWAYSBYDEFAULT = null,
    `match`: FULL | SIMPLE = null,
    notNull: js.UndefOr[Boolean] = js.undefined,
    onDelete: Action = null,
    onUpdate: Action = null,
    primaryKey: js.UndefOr[Boolean] = js.undefined,
    references: Name = null,
    referencesConstraintComment: String = null,
    referencesConstraintName: String = null,
    unique: js.UndefOr[Boolean] = js.undefined
  ): ColumnDefinition = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (check != null) __obj.updateDynamic("check")(check.asInstanceOf[js.Any])
    if (collation != null) __obj.updateDynamic("collation")(collation.asInstanceOf[js.Any])
    if (!js.isUndefined(comment)) __obj.updateDynamic("comment")(comment.asInstanceOf[js.Any])
    if (!js.isUndefined(default)) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (!js.isUndefined(deferrable)) __obj.updateDynamic("deferrable")(deferrable.get.asInstanceOf[js.Any])
    if (!js.isUndefined(deferred)) __obj.updateDynamic("deferred")(deferred.get.asInstanceOf[js.Any])
    if (generated != null) __obj.updateDynamic("generated")(generated.asInstanceOf[js.Any])
    if (`match` != null) __obj.updateDynamic("match")(`match`.asInstanceOf[js.Any])
    if (!js.isUndefined(notNull)) __obj.updateDynamic("notNull")(notNull.get.asInstanceOf[js.Any])
    if (onDelete != null) __obj.updateDynamic("onDelete")(onDelete.asInstanceOf[js.Any])
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate.asInstanceOf[js.Any])
    if (!js.isUndefined(primaryKey)) __obj.updateDynamic("primaryKey")(primaryKey.get.asInstanceOf[js.Any])
    if (references != null) __obj.updateDynamic("references")(references.asInstanceOf[js.Any])
    if (referencesConstraintComment != null) __obj.updateDynamic("referencesConstraintComment")(referencesConstraintComment.asInstanceOf[js.Any])
    if (referencesConstraintName != null) __obj.updateDynamic("referencesConstraintName")(referencesConstraintName.asInstanceOf[js.Any])
    if (!js.isUndefined(unique)) __obj.updateDynamic("unique")(unique.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ColumnDefinition]
  }
}

