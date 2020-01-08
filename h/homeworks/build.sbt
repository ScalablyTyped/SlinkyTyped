organization := "org.scalablytyped.slinky"
name := "homeworks"
version := "1.0.50-0ff0a4"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-14cf79",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-62fa8b",
  "org.scalablytyped.slinky" %%% "angular__forms" % "8.2.14-421ed3",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20190731Z-f30c20",
  "org.scalablytyped.slinky" %%% "jquery" % "3.3-dt-20191126Z-c6d356",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-efacc9",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-b42d8f",
  "org.scalablytyped.slinky" %%% "sizzle" % "2.3-dt-20181006Z-dd2029",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20190322Z-aff20c",
  "org.scalablytyped.slinky" %%% "typescript" % "3.7.4-87e177")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        