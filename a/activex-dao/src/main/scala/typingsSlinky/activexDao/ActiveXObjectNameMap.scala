package typingsSlinky.activexDao

import typingsSlinky.activexDao.DAO.DBEngine
import typingsSlinky.activexDao.DAO.Field
import typingsSlinky.activexDao.DAO.Group
import typingsSlinky.activexDao.DAO.Index
import typingsSlinky.activexDao.DAO.QueryDef
import typingsSlinky.activexDao.DAO.Relation
import typingsSlinky.activexDao.DAO.TableDef
import typingsSlinky.activexDao.DAO.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActiveXObjectNameMap extends js.Object {
  @JSName("DAO.DBEngine")
  var DAODotDBEngine: DBEngine = js.native
  @JSName("DAO.Field")
  var DAODotField: Field = js.native
  @JSName("DAO.Group")
  var DAODotGroup: Group = js.native
  @JSName("DAO.Index")
  var DAODotIndex: Index = js.native
  @JSName("DAO.PrivateDBEngine")
  var DAODotPrivateDBEngine: DBEngine = js.native
  @JSName("DAO.QueryDef")
  var DAODotQueryDef: QueryDef = js.native
  @JSName("DAO.Relation")
  var DAODotRelation: Relation = js.native
  @JSName("DAO.TableDef")
  var DAODotTableDef: TableDef = js.native
  @JSName("DAO.User")
  var DAODotUser: User = js.native
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    DAODotDBEngine: DBEngine,
    DAODotField: Field,
    DAODotGroup: Group,
    DAODotIndex: Index,
    DAODotPrivateDBEngine: DBEngine,
    DAODotQueryDef: QueryDef,
    DAODotRelation: Relation,
    DAODotTableDef: TableDef,
    DAODotUser: User
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DAO.DBEngine")(DAODotDBEngine.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Field")(DAODotField.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Group")(DAODotGroup.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Index")(DAODotIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.PrivateDBEngine")(DAODotPrivateDBEngine.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.QueryDef")(DAODotQueryDef.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Relation")(DAODotRelation.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.TableDef")(DAODotTableDef.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.User")(DAODotUser.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
  @scala.inline
  implicit class ActiveXObjectNameMapOps[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDAODotDBEngine(value: DBEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAO.DBEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDAODotField(value: Field): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAO.Field")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDAODotGroup(value: Group): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAO.Group")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDAODotIndex(value: Index): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAO.Index")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDAODotPrivateDBEngine(value: DBEngine): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAO.PrivateDBEngine")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDAODotQueryDef(value: QueryDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAO.QueryDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDAODotRelation(value: Relation): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAO.Relation")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDAODotTableDef(value: TableDef): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAO.TableDef")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withDAODotUser(value: User): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("DAO.User")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

