package typingsSlinky.antvDataSet

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
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
import typingsSlinky.antvDataSet.dataSetMod.DataSetOptions
import typingsSlinky.antvDataSet.viewMod.View
import typingsSlinky.antvDataSet.viewMod.ViewOptions
import typingsSlinky.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Edges extends StObject {
    
    var edges: js.Array[_] = js.native
    
    var nodes: js.Array[_] = js.native
  }
  object Edges {
    
    @scala.inline
    def apply(edges: js.Array[_], nodes: js.Array[_]): Edges = {
      val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
      __obj.asInstanceOf[Edges]
    }
    
    @scala.inline
    implicit class EdgesMutableBuilder[Self <: Edges] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEdges(value: js.Array[_]): Self = StObject.set(x, "edges", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgesVarargs(value: js.Any*): Self = StObject.set(x, "edges", js.Array(value :_*))
      
      @scala.inline
      def setNodes(value: js.Array[_]): Self = StObject.set(x, "nodes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodesVarargs(value: js.Any*): Self = StObject.set(x, "nodes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GEO extends StObject {
    
    var GEO: String = js.native
    
    var GEO_GRATICULE: String = js.native
    
    var GRAPH: String = js.native
    
    var HEX: String = js.native
    
    var HIERARCHY: String = js.native
    
    var STATISTICS_METHODS: js.Array[String] = js.native
    
    var TABLE: String = js.native
  }
  object GEO {
    
    @scala.inline
    def apply(
      GEO: String,
      GEO_GRATICULE: String,
      GRAPH: String,
      HEX: String,
      HIERARCHY: String,
      STATISTICS_METHODS: js.Array[String],
      TABLE: String
    ): GEO = {
      val __obj = js.Dynamic.literal(GEO = GEO.asInstanceOf[js.Any], GEO_GRATICULE = GEO_GRATICULE.asInstanceOf[js.Any], GRAPH = GRAPH.asInstanceOf[js.Any], HEX = HEX.asInstanceOf[js.Any], HIERARCHY = HIERARCHY.asInstanceOf[js.Any], STATISTICS_METHODS = STATISTICS_METHODS.asInstanceOf[js.Any], TABLE = TABLE.asInstanceOf[js.Any])
      __obj.asInstanceOf[GEO]
    }
    
    @scala.inline
    implicit class GEOMutableBuilder[Self <: GEO] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGEO(value: String): Self = StObject.set(x, "GEO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGEO_GRATICULE(value: String): Self = StObject.set(x, "GEO_GRATICULE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGRAPH(value: String): Self = StObject.set(x, "GRAPH", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHEX(value: String): Self = StObject.set(x, "HEX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHIERARCHY(value: String): Self = StObject.set(x, "HIERARCHY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTATISTICS_METHODS(value: js.Array[String]): Self = StObject.set(x, "STATISTICS_METHODS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSTATISTICS_METHODSVarargs(value: String*): Self = StObject.set(x, "STATISTICS_METHODS", js.Array(value :_*))
      
      @scala.inline
      def setTABLE(value: String): Self = StObject.set(x, "TABLE", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SankeyCenter extends StObject
  
  @js.native
  trait Type[T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */] extends StObject {
    
    var `type`: T = js.native
  }
  object Type {
    
    @scala.inline
    def apply[T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */](`type`: T): Type[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type[T]]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type[_], T /* <: filter | map | pick | rename | `rename-fields` | reverse | default | sort | sortBy | `sort-by` | subset | partition | group | groups | fold | `fill-rows` | fillRows | impute | aggregate | summary | percent | proportion | regression | kernelDotdensity | `kernel-smoothDotdensity` | kernelDotregression | `kernel-smoothDotregression` | binDothistogram | binDotdot | binDothexagon | binDothex | hexbin | binDotquantile | binDotrectangle | binDotrect | treemap | hierarchyDottreemap | adjacency | hierarchyDotpartition | voronoi | diagramDotvoronoi | diagramDotsankey | sankey | diagramDotarc | arc | geoDotregion | geoDotprojection | geoDotcentroid | `tag-cloud` | `word-cloud` */] (val x: Self with Type[T]) extends AnyVal {
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeT[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */] extends StObject {
    
    var `type`: T = js.native
  }
  object TypeT {
    
    @scala.inline
    def apply[T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */](`type`: T): TypeT[T] = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypeT[T]]
    }
    
    @scala.inline
    implicit class TypeTMutableBuilder[Self <: TypeT[_], T /* <: csv | tsv | dsv | graph | diagram | hex | hexjson_ | `hex-json` | HexJSON | geo | geojson_ | GeoJSON | hierarchy | tree | topojson_ | TopoJSON */] (val x: Self with TypeT[T]) extends AnyVal {
      
      @scala.inline
      def setType(value: T): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TypeofDataSet
    extends Instantiable0[DataSet]
       with Instantiable1[/* initialProps */ DataSetOptions, DataSet] {
    
    /**
      * 常量，譬如 DataSet.CONSTANTS.HIERARCHY 是树形结构的名称
      */
    var CONSTANTS: GEO = js.native
    
    /**
      * 注册的 Connector（key-value 对）
      */
    var connectors: Record[String, _] = js.native
    
    def getConnector(name: String): js.Function = js.native
    
    def getTransform(): js.Function = js.native
    def getTransform(name: String): js.Function = js.native
    
    /**
      * 注册一个数据连接函数，注册后所有数据视图都可以使用 name 来引用这个数据连接函数，从而接入某种数据源。
      * @param name - 类型
      * @param connector - 解析逻辑
      */
    def registerConnector(name: String, connector: js.Function3[/* data */ js.Any, /* options */ js.Any, /* view */ View, _]): Unit = js.native
    
    /**
      * 注册一个数据处理函数，注册后所有数据视图都可以使用 name 来引用这个数据处理函数，从而进行某种数据处理
      * @param name - transform 类型
      * @param transform - transform逻辑
      */
    def registerTransform(name: String, transform: js.Any): Unit = js.native
    
    /**
      * 已注册的 Transform（key-value 对）
      */
    var transforms: Record[String, _] = js.native
    
    var version: String = js.native
  }
  
  @js.native
  trait TypeofDataSetInstantiable
    extends Instantiable0[DataSet]
       with Instantiable1[/* initialProps */ DataSetOptions, DataSet] {
    
    /**
      * 常量，譬如 DataSet.CONSTANTS.HIERARCHY 是树形结构的名称
      */
    var CONSTANTS: GEO = js.native
    
    /**
      * 注册的 Connector（key-value 对）
      */
    var connectors: Record[String, _] = js.native
    
    def getConnector(name: String): js.Function = js.native
    
    def getTransform(): js.Function = js.native
    def getTransform(name: String): js.Function = js.native
    
    /**
      * 注册一个数据连接函数，注册后所有数据视图都可以使用 name 来引用这个数据连接函数，从而接入某种数据源。
      * @param name - 类型
      * @param connector - 解析逻辑
      */
    def registerConnector(
      name: String,
      connector: js.Function3[/* data */ js.Any, /* options */ js.Any, /* view */ this.type, _]
    ): Unit = js.native
    
    /**
      * 注册一个数据处理函数，注册后所有数据视图都可以使用 name 来引用这个数据处理函数，从而进行某种数据处理
      * @param name - transform 类型
      * @param transform - transform逻辑
      */
    def registerTransform(name: String, transform: js.Any): Unit = js.native
    
    /**
      * 已注册的 Transform（key-value 对）
      */
    var transforms: Record[String, _] = js.native
    
    var version: String = js.native
  }
  
  @js.native
  trait TypeofView
    extends Instantiable0[View]
       with Instantiable1[/* options */ ViewOptions, View]
}
