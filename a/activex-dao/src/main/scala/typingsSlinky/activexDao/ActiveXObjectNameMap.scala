package typingsSlinky.activexDao

import typingsSlinky.activexDao.DAO.DBEngine
import typingsSlinky.activexDao.DAO.Field
import typingsSlinky.activexDao.DAO.Group
import typingsSlinky.activexDao.DAO.Index
import typingsSlinky.activexDao.DAO.QueryDef
import typingsSlinky.activexDao.DAO.Relation
import typingsSlinky.activexDao.DAO.TableDef
import typingsSlinky.activexDao.DAO.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActiveXObjectNameMap extends StObject {
  
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
  implicit class ActiveXObjectNameMapMutableBuilder[Self <: ActiveXObjectNameMap] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDAODotDBEngine(value: DBEngine): Self = StObject.set(x, "DAO.DBEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDAODotField(value: Field): Self = StObject.set(x, "DAO.Field", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDAODotGroup(value: Group): Self = StObject.set(x, "DAO.Group", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDAODotIndex(value: Index): Self = StObject.set(x, "DAO.Index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDAODotPrivateDBEngine(value: DBEngine): Self = StObject.set(x, "DAO.PrivateDBEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDAODotQueryDef(value: QueryDef): Self = StObject.set(x, "DAO.QueryDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDAODotRelation(value: Relation): Self = StObject.set(x, "DAO.Relation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDAODotTableDef(value: TableDef): Self = StObject.set(x, "DAO.TableDef", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDAODotUser(value: User): Self = StObject.set(x, "DAO.User", value.asInstanceOf[js.Any])
  }
}
