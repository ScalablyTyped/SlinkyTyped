package typingsSlinky.antvDataSet

import typingsSlinky.antvDataSet.anon.Edges
import typingsSlinky.antvDataSet.anon.Type
import typingsSlinky.antvDataSet.anon.TypeT
import typingsSlinky.antvDataSet.anon.TypeofDataSetInstantiable
import typingsSlinky.antvDataSet.antvDataSetStrings.GeoJSON
import typingsSlinky.antvDataSet.antvDataSetStrings.HexJSON
import typingsSlinky.antvDataSet.antvDataSetStrings.TopoJSON
import typingsSlinky.antvDataSet.antvDataSetStrings.`fill-rows`
import typingsSlinky.antvDataSet.antvDataSetStrings.`hex-json`
import typingsSlinky.antvDataSet.antvDataSetStrings.`kernel-smoothDotdensity`
import typingsSlinky.antvDataSet.antvDataSetStrings.`kernel-smoothDotregression`
import typingsSlinky.antvDataSet.antvDataSetStrings.`rename-fields`
import typingsSlinky.antvDataSet.antvDataSetStrings.`sort-by`
import typingsSlinky.antvDataSet.antvDataSetStrings.`tag-cloud`
import typingsSlinky.antvDataSet.antvDataSetStrings.`word-cloud`
import typingsSlinky.antvDataSet.antvDataSetStrings.adjacency
import typingsSlinky.antvDataSet.antvDataSetStrings.aggregate
import typingsSlinky.antvDataSet.antvDataSetStrings.arc
import typingsSlinky.antvDataSet.antvDataSetStrings.binDotdot
import typingsSlinky.antvDataSet.antvDataSetStrings.binDothex
import typingsSlinky.antvDataSet.antvDataSetStrings.binDothexagon
import typingsSlinky.antvDataSet.antvDataSetStrings.binDothistogram
import typingsSlinky.antvDataSet.antvDataSetStrings.binDotquantile
import typingsSlinky.antvDataSet.antvDataSetStrings.binDotrect
import typingsSlinky.antvDataSet.antvDataSetStrings.binDotrectangle
import typingsSlinky.antvDataSet.antvDataSetStrings.csv
import typingsSlinky.antvDataSet.antvDataSetStrings.default
import typingsSlinky.antvDataSet.antvDataSetStrings.diagram
import typingsSlinky.antvDataSet.antvDataSetStrings.diagramDotarc
import typingsSlinky.antvDataSet.antvDataSetStrings.diagramDotsankey
import typingsSlinky.antvDataSet.antvDataSetStrings.diagramDotvoronoi
import typingsSlinky.antvDataSet.antvDataSetStrings.dsv
import typingsSlinky.antvDataSet.antvDataSetStrings.fillRows
import typingsSlinky.antvDataSet.antvDataSetStrings.filter
import typingsSlinky.antvDataSet.antvDataSetStrings.fold
import typingsSlinky.antvDataSet.antvDataSetStrings.geo
import typingsSlinky.antvDataSet.antvDataSetStrings.geoDotcentroid
import typingsSlinky.antvDataSet.antvDataSetStrings.geoDotprojection
import typingsSlinky.antvDataSet.antvDataSetStrings.geoDotregion
import typingsSlinky.antvDataSet.antvDataSetStrings.geojson_
import typingsSlinky.antvDataSet.antvDataSetStrings.graph
import typingsSlinky.antvDataSet.antvDataSetStrings.group
import typingsSlinky.antvDataSet.antvDataSetStrings.groups
import typingsSlinky.antvDataSet.antvDataSetStrings.hex
import typingsSlinky.antvDataSet.antvDataSetStrings.hexbin
import typingsSlinky.antvDataSet.antvDataSetStrings.hexjson_
import typingsSlinky.antvDataSet.antvDataSetStrings.hierarchy
import typingsSlinky.antvDataSet.antvDataSetStrings.hierarchyDotpartition
import typingsSlinky.antvDataSet.antvDataSetStrings.hierarchyDottreemap
import typingsSlinky.antvDataSet.antvDataSetStrings.impute
import typingsSlinky.antvDataSet.antvDataSetStrings.kernelDotdensity
import typingsSlinky.antvDataSet.antvDataSetStrings.kernelDotregression
import typingsSlinky.antvDataSet.antvDataSetStrings.map
import typingsSlinky.antvDataSet.antvDataSetStrings.partition
import typingsSlinky.antvDataSet.antvDataSetStrings.percent
import typingsSlinky.antvDataSet.antvDataSetStrings.pick
import typingsSlinky.antvDataSet.antvDataSetStrings.proportion
import typingsSlinky.antvDataSet.antvDataSetStrings.regression
import typingsSlinky.antvDataSet.antvDataSetStrings.rename
import typingsSlinky.antvDataSet.antvDataSetStrings.reverse
import typingsSlinky.antvDataSet.antvDataSetStrings.sankey
import typingsSlinky.antvDataSet.antvDataSetStrings.sort
import typingsSlinky.antvDataSet.antvDataSetStrings.sortBy
import typingsSlinky.antvDataSet.antvDataSetStrings.subset
import typingsSlinky.antvDataSet.antvDataSetStrings.summary
import typingsSlinky.antvDataSet.antvDataSetStrings.topojson_
import typingsSlinky.antvDataSet.antvDataSetStrings.tree
import typingsSlinky.antvDataSet.antvDataSetStrings.treemap
import typingsSlinky.antvDataSet.antvDataSetStrings.tsv
import typingsSlinky.antvDataSet.antvDataSetStrings.voronoi
import typingsSlinky.antvDataSet.dataSetMod.DataSet
import typingsSlinky.antvDataSet.geoMod.GeoApi
import typingsSlinky.antvDataSet.hierarchyMod.HierarchyApi
import typingsSlinky.antvDataSet.partitionMod.PartitionApi
import typingsSlinky.antvDataSet.statisticsMod.StatisticsApi
import typingsSlinky.wolfy87Eventemitter.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object viewMod {
  
  @JSImport("@antv/data-set/lib/view", "View")
  @js.native
  class View ()
    extends ^
       with StatisticsApi
       with PartitionApi
       with HierarchyApi
       with GeoApi {
    def this(dataSet: DataSet) = this()
    def this(options: ViewOptions) = this()
    def this(dataSet: js.UndefOr[scala.Nothing], options: ViewOptions) = this()
    def this(dataSet: DataSet, options: ViewOptions) = this()
    
    var _GridHexJSON: js.Any = js.native
    
    var _HexJSON: js.Any = js.native
    
    var _executeTransform: js.Any = js.native
    
    var _gridRows: js.Any = js.native
    
    var _parseStateExpression: js.Any = js.native
    
    var _prepareSource: js.Any = js.native
    
    var _preparseOptions: js.Any = js.native
    
    var _projectedAs: js.Array[String] = js.native
    
    var _reExecute: js.Any = js.native
    
    var _reExecuteTransforms: js.Any = js.native
    
    var _source: CustomSource = js.native
    
    var _tagCloud: js.Any = js.native
    
    def addRow(row: js.Any): Unit = js.native
    
    /**
      * 关联的数据集
      */
    var dataSet: DataSet | Null = js.native
    
    /**
      * 数据视图类型
      */
    var dataType: String = js.native
    
    var edges: js.Array[_] = js.native
    
    def findRow(query: js.Any): js.Any = js.native
    
    def findRows(query: js.Any): js.Array[_] = js.native
    
    def getColumn(columnName: String): js.Array[_] = js.native
    
    def getColumnData(columnName: String): js.Array[_] = js.native
    
    def getColumnIndex(columnName: String): Double = js.native
    
    def getColumnName(index: Double): String = js.native
    
    def getColumnNames(): js.Array[String] = js.native
    
    def getSubset(startRowIndex: Double, endRowIndex: Double, columnNames: js.Array[String]): js.Array[_] = js.native
    
    var graph: Edges = js.native
    
    /**
      * 是否是View
      */
    var isDataView: Boolean = js.native
    
    /**
      * 是否是View
      */
    var isView: Boolean = js.native
    
    /**
      * 是否关联了数据集
      */
    var loose: Boolean = js.native
    
    var nodes: js.Array[_] = js.native
    
    /**
      * 原始数据
      */
    var origin: js.Array[_] = js.native
    
    def removeRow(index: Double): Unit = js.native
    
    /**
      * 存储处理后的数据
      */
    var rows: js.Array[_] = js.native
    
    /**
      * 载入数据
      *
      * @remarks
      * data 是原始数据，可能是字符串，也可能是数组、对象，或者另一个数据视图实例。options 里指定了载入数据使用的 connector 和载入时使用的配置项。
      *
      * @param source - 数据
      * @param options- 数据解析配置
      */
    def source(source: String): View = js.native
    def source(
      source: /* import warning: importer.ImportType#apply Failed type conversion: [string, {}][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [string, @antv/data-set.@antv/data-set/lib/connector/dsv.Options][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [any, @antv/data-set.@antv/data-set/lib/connector/graph.Options][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [std.Array<any>, @antv/data-set.@antv/data-set/lib/connector/hexjson.Options][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [any, {}][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [any, @antv/data-set.@antv/data-set/lib/connector/hierarchy.Options][0] */ /* import warning: importer.ImportType#apply Failed type conversion: [any, @antv/data-set.@antv/data-set/lib/connector/topojson.Options][0] */ js.Any,
      options: ConnectorOptions[
          GeoJSON | HexJSON | TopoJSON | csv | diagram | dsv | geo | geojson_ | graph | hex | `hex-json` | hexjson_ | hierarchy | topojson_ | tree | tsv
        ]
    ): View = js.native
    def source(source: js.Array[_]): View = js.native
    def source(source: View): View = js.native
    
    def toString(prettyPrint: Boolean): String = js.native
    
    /**
      *  执行数据处理数据。执行完这个函数后，transform 会被存储
      * @param options - 某种类型的transform
      */
    def transform(): View = js.native
    @JSName("transform")
    def transform_adjacency(options: TransformOptions[adjacency]): View = js.native
    @JSName("transform")
    def transform_aggregate(options: TransformOptions[aggregate]): View = js.native
    @JSName("transform")
    def transform_arc(options: TransformOptions[arc]): View = js.native
    @JSName("transform")
    def transform_bindot(options: TransformOptions[binDotdot]): View = js.native
    @JSName("transform")
    def transform_binhex(options: TransformOptions[binDothex]): View = js.native
    @JSName("transform")
    def transform_binhexagon(options: TransformOptions[binDothexagon]): View = js.native
    @JSName("transform")
    def transform_binhistogram(options: TransformOptions[binDothistogram]): View = js.native
    @JSName("transform")
    def transform_binquantile(options: TransformOptions[binDotquantile]): View = js.native
    @JSName("transform")
    def transform_binrect(options: TransformOptions[binDotrect]): View = js.native
    @JSName("transform")
    def transform_binrectangle(options: TransformOptions[binDotrectangle]): View = js.native
    @JSName("transform")
    def transform_default(options: TransformOptions[default]): View = js.native
    @JSName("transform")
    def transform_diagramarc(options: TransformOptions[diagramDotarc]): View = js.native
    @JSName("transform")
    def transform_diagramsankey(options: TransformOptions[diagramDotsankey]): View = js.native
    @JSName("transform")
    def transform_diagramvoronoi(options: TransformOptions[diagramDotvoronoi]): View = js.native
    @JSName("transform")
    def transform_fillRows(options: TransformOptions[fillRows]): View = js.native
    @JSName("transform")
    def transform_fillrows(options: TransformOptions[`fill-rows`]): View = js.native
    @JSName("transform")
    def transform_filter(options: TransformOptions[filter]): View = js.native
    @JSName("transform")
    def transform_fold(options: TransformOptions[fold]): View = js.native
    @JSName("transform")
    def transform_geocentroid(options: TransformOptions[geoDotcentroid]): View = js.native
    @JSName("transform")
    def transform_geoprojection(options: TransformOptions[geoDotprojection]): View = js.native
    @JSName("transform")
    def transform_georegion(options: TransformOptions[geoDotregion]): View = js.native
    @JSName("transform")
    def transform_group(options: TransformOptions[group]): View = js.native
    @JSName("transform")
    def transform_groups(options: TransformOptions[groups]): View = js.native
    @JSName("transform")
    def transform_hexbin(options: TransformOptions[hexbin]): View = js.native
    @JSName("transform")
    def transform_hierarchypartition(options: TransformOptions[hierarchyDotpartition]): View = js.native
    @JSName("transform")
    def transform_hierarchytreemap(options: TransformOptions[hierarchyDottreemap]): View = js.native
    @JSName("transform")
    def transform_impute(options: TransformOptions[impute]): View = js.native
    @JSName("transform")
    def transform_kerneldensity(options: TransformOptions[kernelDotdensity]): View = js.native
    @JSName("transform")
    def transform_kernelregression(options: TransformOptions[kernelDotregression]): View = js.native
    @JSName("transform")
    def transform_kernelsmoothdensity(options: TransformOptions[`kernel-smoothDotdensity`]): View = js.native
    @JSName("transform")
    def transform_kernelsmoothregression(options: TransformOptions[`kernel-smoothDotregression`]): View = js.native
    @JSName("transform")
    def transform_map(options: TransformOptions[map]): View = js.native
    @JSName("transform")
    def transform_partition(options: TransformOptions[partition]): View = js.native
    @JSName("transform")
    def transform_percent(options: TransformOptions[percent]): View = js.native
    @JSName("transform")
    def transform_pick(options: TransformOptions[pick]): View = js.native
    @JSName("transform")
    def transform_proportion(options: TransformOptions[proportion]): View = js.native
    @JSName("transform")
    def transform_regression(options: TransformOptions[regression]): View = js.native
    @JSName("transform")
    def transform_rename(options: TransformOptions[rename]): View = js.native
    @JSName("transform")
    def transform_renamefields(options: TransformOptions[`rename-fields`]): View = js.native
    @JSName("transform")
    def transform_reverse(options: TransformOptions[reverse]): View = js.native
    @JSName("transform")
    def transform_sankey(options: TransformOptions[sankey]): View = js.native
    @JSName("transform")
    def transform_sort(options: TransformOptions[sort]): View = js.native
    @JSName("transform")
    def transform_sortBy(options: TransformOptions[sortBy]): View = js.native
    @JSName("transform")
    def transform_sortby(options: TransformOptions[`sort-by`]): View = js.native
    @JSName("transform")
    def transform_subset(options: TransformOptions[subset]): View = js.native
    @JSName("transform")
    def transform_summary(options: TransformOptions[summary]): View = js.native
    @JSName("transform")
    def transform_tagcloud(options: TransformOptions[`tag-cloud`]): View = js.native
    @JSName("transform")
    def transform_treemap(options: TransformOptions[treemap]): View = js.native
    @JSName("transform")
    def transform_voronoi(options: TransformOptions[voronoi]): View = js.native
    @JSName("transform")
    def transform_wordcloud(options: TransformOptions[`word-cloud`]): View = js.native
    
    /**
      * 已应用的 transform
      */
    var transforms: js.Array[TransformOptions[_]] = js.native
    
    def updateRow(index: Double, newRow: js.Any): Unit = js.native
    
    /**
      *
      */
    var watchingStates: js.Any = js.native
  }
  /* static members */
  object View {
    
    @JSImport("@antv/data-set/lib/view", "View")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@antv/data-set/lib/view", "View.DataSet")
    @js.native
    def DataSet: TypeofDataSetInstantiable = js.native
    @scala.inline
    def DataSet_=(x: TypeofDataSetInstantiable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DataSet")(x.asInstanceOf[js.Any])
  }
  
  type ConnectorOptions[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */] = TypeT[T] with (/* import warning: importer.ImportType#apply Failed type conversion: @antv/data-set.@antv/data-set/lib/connector-params.ConnectorParams[T][1] */ js.Any)
  
  @js.native
  trait CustomSource extends StObject {
    
    var options: js.Any = js.native
    
    var source: js.Any = js.native
  }
  object CustomSource {
    
    @scala.inline
    def apply(options: js.Any, source: js.Any): CustomSource = {
      val __obj = js.Dynamic.literal(options = options.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomSource]
    }
    
    @scala.inline
    implicit class CustomSourceMutableBuilder[Self <: CustomSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOptions(value: js.Any): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSource(value: js.Any): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
  
  type TransformOptions[T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */] = Type[T] with (/* import warning: importer.ImportType#apply Failed type conversion: @antv/data-set.@antv/data-set/lib/transform-params.TransformsParams[T] */ js.Any)
  
  @js.native
  trait ViewOptions extends StObject {
    
    var watchingStates: js.UndefOr[js.Array[String]] = js.native
  }
  object ViewOptions {
    
    @scala.inline
    def apply(): ViewOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewOptions]
    }
    
    @scala.inline
    implicit class ViewOptionsMutableBuilder[Self <: ViewOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWatchingStates(value: js.Array[String]): Self = StObject.set(x, "watchingStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWatchingStatesUndefined: Self = StObject.set(x, "watchingStates", js.undefined)
      
      @scala.inline
      def setWatchingStatesVarargs(value: String*): Self = StObject.set(x, "watchingStates", js.Array(value :_*))
    }
  }
}
