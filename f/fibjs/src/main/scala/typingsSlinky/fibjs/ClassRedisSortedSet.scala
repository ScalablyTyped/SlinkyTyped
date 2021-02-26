package typingsSlinky.fibjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** module Or Internal Object */
/**
  * @brief Redis 数据库客户端 SortedSet 对象，此对象为包含指定 key 的客户端，只有调用其方法才会操作数据库
  * @detail 用以操作 Redis 的 SortedSet 对象，创建方法：,```JavaScript,var db = require("db");,var rdb = new db.openRedis("redis-server");,var set = rdb.getSortedSet("test");,```
  */
@js.native
trait ClassRedisSortedSet extends ClassObject {
  
  /**
    * 
    * @brief 将一个或多个 member 元素及其 score 值加入到有序集当中
    * @param sms 指定要添加的 member/score 列表
    * @return 被成功添加的新成员的数量，不包括那些被更新的、已经存在的成员
    * 
    * 
    */
  def add(sms: js.Any*): Double = js.native
  /**
    * 
    * @brief 将一个或多个 member 元素及其 score 值加入到有序集当中
    * @param sms 指定要添加的 member/score 对象
    * @return 被成功添加的新成员的数量，不包括那些被更新的、已经存在的成员
    * 
    * 
    */
  def add(sms: js.Object): Double = js.native
  
  /**
    * 
    * @brief 返回有序集中， score 值在 min 和 max 之间(默认包括 score 值等于 min 或 max )的成员的数量
    * @param min 指定统计的最小 score
    * @param max 指定统计的最大 score
    * @return score 值在 min 和 max 之间的成员的数量
    * 
    * 
    */
  def count(min: Double, max: Double): Double = js.native
  
  /**
    * 
    * @brief 为有序集的成员 member 的 score 值加上增量 num
    * @param member 指定要修改的 member
    * @param num 指定要加上的数值
    * @return member 成员的新 score 值，以字符串形式表示
    * 
    * 
    */
  def incr(member: ClassBuffer): ClassBuffer = js.native
  def incr(member: ClassBuffer, num: Double): ClassBuffer = js.native
  
  /**
    * 
    * @brief 返回有序集中元素的数量
    * @return 返回有序集的长度
    * 
    * 
    */
  def len(): Double = js.native
  
  /**
    * 
    * @brief 返回有序集中，指定区间内的成员，成员的位置按 score 值递增(从小到大)来排序
    * @param start 指定查询的起始下标，0 表示第一个元素，-1 表示最后一个元素
    * @param stop 指定查询的结束下标，0 表示第一个元素，-1 表示最后一个元素
    * @param withScores 指定是否在结果中包含 score
    * @return 指定区间内，带有 score 值(可选)的有序集成员的列表
    * 
    * 
    */
  def range(start: Double, stop: Double): js.Array[_] = js.native
  def range(start: Double, stop: Double, withScores: Boolean): js.Array[_] = js.native
  
  /**
    * 
    * @brief 返回有序集中，指定区间内的成员，成员的位置按 score 值递减(从大到小)来排序
    * @param start 指定查询的起始下标，0 表示第一个元素，-1 表示最后一个元素
    * @param stop 指定查询的结束下标，0 表示第一个元素，-1 表示最后一个元素
    * @param withScores 指定是否在结果中包含 score
    * @return 指定区间内，带有 score 值(可选)的有序集成员的列表
    * 
    * 
    */
  def rangeRev(start: Double, stop: Double): js.Array[_] = js.native
  def rangeRev(start: Double, stop: Double, withScores: Boolean): js.Array[_] = js.native
  
  /**
    * 
    * @brief 有序集中成员 member 的排名。其中有序集成员按 score 值递增(从小到大)顺序排列
    * @param member 指定要查询的 member
    * @return member 如果 member 是有序集 key 的成员，返回 member 的排名。如果 member 不是有序集 key 的成员，返回 nil
    * 
    * 
    */
  def rank(member: ClassBuffer): Double = js.native
  
  /**
    * 
    * @brief 有序集中成员 member 的排名。其中有序集成员按 score 值递减(从大到小)顺序排列
    * @param member 指定要查询的 member
    * @return member 如果 member 是有序集 key 的成员，返回 member 的排名。如果 member 不是有序集 key 的成员，返回 nil
    * 
    * 
    */
  def rankRev(member: ClassBuffer): Double = js.native
  
  /**
    * 
    * @brief 移除有序集中的一个或多个 member 元素
    * @param members 指定要移除的元素列表
    * @return 被成功移除的元素的数量，不包括被忽略的元素
    * 
    * 
    */
  def remove(members: js.Any*): Double = js.native
  /**
    * 
    * @brief 移除有序集中的一个或多个 member 元素
    * @param members 指定要移除的元素数组
    * @return 被成功移除的元素的数量，不包括被忽略的元素
    * 
    * 
    */
  def remove(members: js.Array[_]): Double = js.native
  
  /**
    * 
    * @brief 返回有序集中，成员 member 的 score 值
    * @param member 指定要查询的 member
    * @return member 成员的 score 值，以字符串形式表示
    * 
    * 
    */
  def score(member: ClassBuffer): ClassBuffer = js.native
}
