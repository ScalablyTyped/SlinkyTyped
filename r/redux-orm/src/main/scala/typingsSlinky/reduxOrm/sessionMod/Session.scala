package typingsSlinky.reduxOrm.sessionMod

import typingsSlinky.reduxOrm.databaseMod.QueryResult
import typingsSlinky.reduxOrm.databaseMod.QuerySpec
import typingsSlinky.reduxOrm.databaseMod.UpdateSpec
import typingsSlinky.reduxOrm.modelMod.ModelType
import typingsSlinky.reduxOrm.ormMod.IndexedModelClasses
import typingsSlinky.reduxOrm.ormMod.OrmState
import typingsSlinky.std.Extract
import typingsSlinky.std.InstanceType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Session[I /* <: IndexedModelClasses[
_, 
Extract[
  /* keyof any */ String, 
  /* import warning: importer.ImportType#apply Failed type conversion: any[keyof any]['modelName'] */ js.Any
]] */] extends js.Object {
  /**
    * list of bound {@link Model} classes bound to this session, bootstrapped during {@link @ORM.register}.
    *
    * @see {@link ModelType}
    */
  val sessionBoundModels: js.Array[
    ModelType[
      InstanceType[
        /* import warning: importer.ImportType#apply Failed type conversion: I[keyof I] */ js.Any
      ]
    ]
  ] = js.native
  /**
    * Current {@link OrmState}, specific to registered schema
    */
  val state: OrmState[I] = js.native
  /**
    * Applies update to a model state.
    *
    * @param  update - the update command object.
    *
    * @returns query result.
    *
    * @see {@link DbAction}
    * @see {@link UpdateSpec}
    * @see {@link DbActionResult}
    * @see {@link UpdateResult}
    */
  def applyUpdate[P](update: UpdateSpec[P]): P = js.native
  /**
    * Executes query against model state.
    *
    * @param query - the query command object.
    *
    * @returns query result.
    *
    * @see {@link QueryType}
    * @see {@link QueryClause}
    * @see {@link QuerySpec}
    * @see {@link QueryResult}
    */
  def query(query: QuerySpec): QueryResult[js.Object] = js.native
}

object Session {
  @scala.inline
  def apply[I](
    applyUpdate: UpdateSpec[js.Any] => js.Any,
    query: QuerySpec => QueryResult[js.Object],
    sessionBoundModels: js.Array[
      ModelType[
        InstanceType[
          /* import warning: importer.ImportType#apply Failed type conversion: I[keyof I] */ js.Any
        ]
      ]
    ],
    state: OrmState[I]
  ): Session[I] = {
    val __obj = js.Dynamic.literal(applyUpdate = js.Any.fromFunction1(applyUpdate), query = js.Any.fromFunction1(query), sessionBoundModels = sessionBoundModels.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[Session[I]]
  }
  @scala.inline
  implicit class SessionOps[Self[i] <: Session[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withApplyUpdate(value: UpdateSpec[js.Any] => js.Any): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("applyUpdate")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withQuery(value: QuerySpec => QueryResult[js.Object]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("query")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSessionBoundModels(
      value: js.Array[
          ModelType[
            InstanceType[
              /* import warning: importer.ImportType#apply Failed type conversion: I[keyof I] */ js.Any
            ]
          ]
        ]
    ): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sessionBoundModels")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withState(value: OrmState[I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("state")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

