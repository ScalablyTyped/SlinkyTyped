package typingsSlinky.anyDbTransaction.mod

import typingsSlinky.anyDb.mod.Queryable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("any-db-transaction", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
    * Start a transaction
    */
  def apply(q: Queryable): Transaction = js.native
  def apply(q: Queryable, beginStatement: String): Transaction = js.native
  def apply(
    q: Queryable,
    beginStatement: String,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = js.native
  def apply(q: Queryable, callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]): Transaction = js.native
  def apply(
    q: Queryable,
    options: js.UndefOr[scala.Nothing],
    beginStatement: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = js.native
  def apply(q: Queryable, options: js.UndefOr[scala.Nothing], beginStatement: String): Transaction = js.native
  def apply(
    q: Queryable,
    options: js.UndefOr[scala.Nothing],
    beginStatement: String,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = js.native
  def apply(
    q: Queryable,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = js.native
  def apply(q: Queryable, options: TransactionOptions): Transaction = js.native
  def apply(
    q: Queryable,
    options: TransactionOptions,
    beginStatement: js.UndefOr[scala.Nothing],
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = js.native
  def apply(q: Queryable, options: TransactionOptions, beginStatement: String): Transaction = js.native
  def apply(
    q: Queryable,
    options: TransactionOptions,
    beginStatement: String,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = js.native
  def apply(
    q: Queryable,
    options: TransactionOptions,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = js.native
}
