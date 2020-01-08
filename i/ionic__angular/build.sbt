organization := "org.scalablytyped.slinky"
name := "ionic__angular"
version := "4.11.7-e35c4d"
scalaVersion := "2.12.10"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "me.shadaj" %%% "slinky-web" % "0.6.2",
  "org.scalablytyped.slinky" %%% "angular__common" % "8.2.14-a8c328",
  "org.scalablytyped.slinky" %%% "angular__compiler" % "8.2.14-14cf79",
  "org.scalablytyped.slinky" %%% "angular__core" % "8.2.14-62fa8b",
  "org.scalablytyped.slinky" %%% "angular__forms" % "8.2.14-421ed3",
  "org.scalablytyped.slinky" %%% "angular__router" % "8.2.14-b65392",
  "org.scalablytyped.slinky" %%% "inquirer" % "6.5-dt-20190731Z-f30c20",
  "org.scalablytyped.slinky" %%% "ionic__core" % "4.11.7-cc10ae",
  "org.scalablytyped.slinky" %%% "ionicons" % "4.6.3-f18c68",
  "org.scalablytyped.slinky" %%% "node" % "13.1-dt-20200103Z-c18ea7",
  "org.scalablytyped.slinky" %%% "rxjs" % "6.5.4-efacc9",
  "org.scalablytyped.slinky" %%% "rxjs-compat" % "6.5.4-b42d8f",
  "org.scalablytyped.slinky" %%% "std" % "3.7-9f4f43",
  "org.scalablytyped.slinky" %%% "through" % "0.0-unknown-dt-20190322Z-aff20c",
  "org.scalablytyped.slinky" %%% "typescript" % "3.7.4-87e177")
publishArtifact in packageDoc := false
scalacOptions ++= List("-P:scalajs:sjsDefinedByDefault", "-g:notailcalls")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "SlinkyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "SlinkyTyped")
        