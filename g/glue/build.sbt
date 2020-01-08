organization := "org.scalablytyped.slinky"
name := "glue"
version := "5.0-dt-20181023Z-ff4cbb"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "boom" % "7.3-dt-20190805Z-795c9f",
  "org.scalablytyped.slinky" %%% "catbox" % "10.0-dt-20190219Z-0205e3",
  "org.scalablytyped.slinky" %%% "hapi" % "18.0-dt-20191115Z-5bd9aa",
  "org.scalablytyped.slinky" %%% "iron" % "5.0-dt-20180214Z-163109",
  "org.scalablytyped.slinky" %%% "joi" % "14.3-dt-20191101Z-90164f",
  "org.scalablytyped.slinky" %%% "mime-db" % "1.27-dt-20190322Z-d112bf",
  "org.scalablytyped.slinky" %%% "mimos" % "3.0-dt-20190322Z-79aaab",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "podium" % "1.0-dt-20190322Z-19372f",
  "org.scalablytyped.slinky" %%% "shot" % "4.0-dt-20181002Z-78751c",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        