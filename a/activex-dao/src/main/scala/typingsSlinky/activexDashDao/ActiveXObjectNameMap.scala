package typingsSlinky.activexDashDao

import typingsSlinky.activexDashDao.DAO.DBEngine
import typingsSlinky.activexDashDao.DAO.Field
import typingsSlinky.activexDashDao.DAO.Group
import typingsSlinky.activexDashDao.DAO.Index
import typingsSlinky.activexDashDao.DAO.QueryDef
import typingsSlinky.activexDashDao.DAO.Relation
import typingsSlinky.activexDashDao.DAO.TableDef
import typingsSlinky.activexDashDao.DAO.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActiveXObjectNameMap extends js.Object {
  var `DAO.DBEngine`: DBEngine
  var `DAO.Field`: Field
  var `DAO.Group`: Group
  var `DAO.Index`: Index
  var `DAO.PrivateDBEngine`: DBEngine
  var `DAO.QueryDef`: QueryDef
  var `DAO.Relation`: Relation
  var `DAO.TableDef`: TableDef
  var `DAO.User`: User
}

object ActiveXObjectNameMap {
  @scala.inline
  def apply(
    `DAO.DBEngine`: DBEngine,
    `DAO.Field`: Field,
    `DAO.Group`: Group,
    `DAO.Index`: Index,
    `DAO.PrivateDBEngine`: DBEngine,
    `DAO.QueryDef`: QueryDef,
    `DAO.Relation`: Relation,
    `DAO.TableDef`: TableDef,
    `DAO.User`: User
  ): ActiveXObjectNameMap = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DAO.DBEngine")(`DAO.DBEngine`.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Field")(`DAO.Field`.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Group")(`DAO.Group`.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Index")(`DAO.Index`.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.PrivateDBEngine")(`DAO.PrivateDBEngine`.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.QueryDef")(`DAO.QueryDef`.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.Relation")(`DAO.Relation`.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.TableDef")(`DAO.TableDef`.asInstanceOf[js.Any])
    __obj.updateDynamic("DAO.User")(`DAO.User`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActiveXObjectNameMap]
  }
}

