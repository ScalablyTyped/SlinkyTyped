package typingsSlinky.apolloDashCache.libTypesDataProxyMod

import typingsSlinky.apolloDashCache.libTypesDataProxyMod.DataProxy.Fragment
import typingsSlinky.apolloDashCache.libTypesDataProxyMod.DataProxy.Query
import typingsSlinky.apolloDashCache.libTypesDataProxyMod.DataProxy.WriteDataOptions
import typingsSlinky.apolloDashCache.libTypesDataProxyMod.DataProxy.WriteFragmentOptions
import typingsSlinky.apolloDashCache.libTypesDataProxyMod.DataProxy.WriteQueryOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSName("DataProxy")
@js.native
trait DataProxy_ extends js.Object {
  def readFragment[FragmentType, TVariables](options: Fragment[TVariables]): FragmentType | Null = js.native
  def readFragment[FragmentType, TVariables](options: Fragment[TVariables], optimistic: Boolean): FragmentType | Null = js.native
  def readQuery[QueryType, TVariables](options: Query[TVariables]): QueryType | Null = js.native
  def readQuery[QueryType, TVariables](options: Query[TVariables], optimistic: Boolean): QueryType | Null = js.native
  def writeData[TData](options: WriteDataOptions[TData]): Unit = js.native
  def writeFragment[TData, TVariables](options: WriteFragmentOptions[TData, TVariables]): Unit = js.native
  def writeQuery[TData, TVariables](options: WriteQueryOptions[TData, TVariables]): Unit = js.native
}

